package com.example.mvpdemo.mainActivityPresenter

interface MainActivityContract {

    interface Presenter {

        // methods View call on Presenter
        fun updateFullName(fullName : String)
        fun updateEmail(email: String)
    }

    interface View {

        // methods Presenter calls on View
        fun showFullName(fullName: String)
        fun showEmail(email: String)
    }

}