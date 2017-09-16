package com.customrnviewdemo.manager

import android.widget.TextView

import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

/**
 * Created by wangjiajie on 2017/9/16.
 */

class CustomAndroidTextViewManager : SimpleViewManager<TextView>() {
    override fun getName(): String {
        return "CustomAndroidTextView"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): TextView {
        val view = TextView(reactContext)
        view.text = "10086"
        return view
    }

    @ReactProp(name = "valuetext")
    fun setText(view: TextView, valuetext: String) {
        view.text = valuetext
    }
}
