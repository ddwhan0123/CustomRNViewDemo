package com.customrnviewdemo.reactpackage

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager

/**
 * Created by wangjiajie on 2017/9/13.
 */
class CustomViewPackage : ReactPackage {
    override fun createNativeModules(reactContext: ReactApplicationContext?): MutableList<NativeModule> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createViewManagers(reactContext: ReactApplicationContext?): MutableList<ViewManager<View, ReactShadowNode>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}