package com.customrnviewdemo.reactpackage

import com.customrnviewdemo.view.CustomAndroidTextViewManager
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import java.util.*

/**
 * Created by wangjiajie on 2017/9/16.
 */
class CustomViewPackage : ReactPackage {
    override fun createNativeModules(reactContext: ReactApplicationContext?): MutableList<NativeModule> = Collections.emptyList()

    override fun createViewManagers(reactContext: ReactApplicationContext?): MutableList<CustomAndroidTextViewManager>? = Collections.singletonList(CustomAndroidTextViewManager())
}