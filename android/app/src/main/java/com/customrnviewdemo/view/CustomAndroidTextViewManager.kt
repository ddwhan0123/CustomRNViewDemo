package com.customrnviewdemo.view

import android.widget.TextView
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

/**
 * Created by wangjiajie on 2017/9/13.
 */
class CustomAndroidTextViewManager : SimpleViewManager<TextView>() {
    override fun getName(): String = "CustomAndroidTextView"

    override fun createViewInstance(reactContext: ThemedReactContext?): TextView = TextView(reactContext)

    //设置文本内容
    @ReactProp(name = "text")
    fun setText(view: TextView, text: String) {
        view.text = text
    }

}