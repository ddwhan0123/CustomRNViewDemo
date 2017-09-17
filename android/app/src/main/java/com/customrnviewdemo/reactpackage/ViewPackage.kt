package com.customrnviewdemo.reactpackage

import com.customrnviewdemo.manager.CircleManager
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

import java.util.Arrays

/**
 * Created by wangjiajie on 2017/9/16.
 */

class ViewPackage : ReactPackage {
    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> =
            emptyList()

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> = Arrays.asList<ViewManager<*, *>>(
            CircleManager()
    )
}
