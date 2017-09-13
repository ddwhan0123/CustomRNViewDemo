package com.customrnviewdemo.view

import android.widget.TextView
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext

/**
 * Created by wangjiajie on 2017/9/13.
 */
class CustomAndroidTextView : SimpleViewManager<TextView>() {

    override fun createViewInstance(reactContext: ThemedReactContext?): TextView {
        return TextView(reactContext)
    }

    override fun getName(): String {
        return "CustomAndroidTextView"
    }
}