package com.customrnviewdemo

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings

import com.customrnviewdemo.reactpackage.ViewPackage
import com.facebook.react.ReactActivity
import com.facebook.react.ReactInstanceManager
import com.facebook.react.ReactRootView
import com.facebook.react.common.LifecycleState
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
import com.facebook.react.shell.MainReactPackage

class MainActivity : ReactActivity(), DefaultHardwareBackBtnHandler {
    private var mReactRootView: ReactRootView? = null//JS对应的Native的根布局
    private var mReactInstanceManager: ReactInstanceManager? = null//Instance 管理器

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    override fun getMainComponentName(): String? {
        return "CustomRNViewDemo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initRNRootView()//初始化RN的rootView，所有解析到的view都按规则添加到改View上
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.canDrawOverlays(this)) {
                val intent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                        Uri.parse("package:" + packageName))
                startActivityForResult(intent, OVERLAY_PERMISSION_REQ_CODE)
            }
        }
    }

    private fun initRNRootView() {
        mReactRootView = ReactRootView(this)
        mReactInstanceManager = ReactInstanceManager.builder().setApplication(application)
                .setBundleAssetName("index.android")//对应离线时打出来的bundle名字
                .setJSMainModuleName("index.android")//对应实际的bundle中的js端的js文件名字，即js端的模块
                .addPackage(MainReactPackage())//React Native 自带的官方封装的各种控件
                .addPackage(ViewPackage())//--##--使用该种视图初始化方式时需要在此处add 注册自定义的ViewManager所在的包，
                //单在Application中注册该包应该是无效。ps:不在Applition中注册好像是也可以，就是不知道有没有别的影响
                .setUseDeveloperSupport(BuildConfig.DEBUG)//BuildConfig.DEBUG 直接用debug 出现crash ---
                .setInitialLifecycleState(LifecycleState.RESUMED)
                .build()
        mReactRootView!!.startReactApplication(mReactInstanceManager, "CustomRNViewDemo", null)
        setContentView(mReactRootView)
    }

    companion object {
        private val OVERLAY_PERMISSION_REQ_CODE = 101
    }
}
