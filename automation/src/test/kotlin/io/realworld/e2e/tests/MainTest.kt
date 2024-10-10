package io.realworld.e2e.tests
import com.codeborne.selenide.Selenide.open
import io.realworld.e2e.pages.MainPage
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class MainTest : BaseTest() {
    @Test
    fun `should open main page`() {
        open("/")
        val mainPage = MainPage()
        mainPage.getTitle() shouldBeEqualTo "Conduit"
    }
}