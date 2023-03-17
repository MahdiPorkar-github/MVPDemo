package com.example.mvpdemo.mainActivityPresenter

import com.example.mvpdemo.mainActivityModel.User

class MainActivityPresenter : BasePresenter<MainActivityContract.View>(),MainActivityContract.Presenter {

    private val user  = User()
    override fun updateEmail(email: String) {
        this.user.email = email
        getView()?.showEmail("Email : $email")
    }

    override fun updateFullName(fullName: String) {
        this.user.fullName = fullName
        getView()?.showFullName("fullName : $fullName")
    }


}