package com.customrnviewdemo.manager

import com.customrnviewdemo.view.CircleView
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

/**
 * Created by wangjiajie on 2017/9/16.
 */
class CircleManager : SimpleViewManager<CircleView>() {
    override fun getName(): String = "MCircle"

    override fun createViewInstance(reactContext: ThemedReactContext?): CircleView = CircleView(reactContext)

    /**
     * 传输背景色参数
     */
    @ReactProp(name = "color")
    fun setColor(view: CircleView, color: Int) {
        view.setColor(color)
    }

    /**
     * 传输半径参数
     */
    @ReactProp(name = "radius")
    fun setRadius(view: CircleView, radius: Int) {
        view.setRadius(radius)
    }

}