package com.example.mvpdemo.mainActivityPresenter

import java.lang.ref.WeakReference

abstract class BasePresenter<V> {

    /*
    we use a weak reference because typically,the concrete view is an activity
    or a fragment class and we need those view object correctly garbage collected
    when they are destroyed,for example when user leaves the screen or rotates the device.
     */

    private var view: WeakReference<V>? = null

    fun setView(view: V) {
        // we wrap view in a WeakReference
        this.view = WeakReference(view)
    }

    // we extract the view from the WeakReference
    protected fun getView(): V? = view?.get()
}

