package io.realworld.e2e.pages

import com.codeborne.selenide.Selenide.page

open class BasePage {
    fun <T> at(pageClass: Class<T>): T {
        return page(pageClass)
    }
}