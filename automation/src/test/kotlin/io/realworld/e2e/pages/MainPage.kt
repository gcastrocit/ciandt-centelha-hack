package io.realworld.e2e.pages

import com.codeborne.selenide.Selenide.title

class MainPage : BasePage() {
    fun getTitle(): String? = title()
}
