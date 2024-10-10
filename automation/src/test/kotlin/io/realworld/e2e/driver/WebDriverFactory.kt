package io.realworld.e2e.driver

import com.codeborne.selenide.Configuration
import com.codeborne.selenide.WebDriverRunner
import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

object WebDriverFactory {
    fun setWebDriver() {
        WebDriverRunner.setWebDriver(createChromeDriver())
    }

    private fun createChromeDriver(): WebDriver {
        WebDriverManager.chromedriver().setup();
        // Set Chrome options here
        return ChromeDriver(getOptions())
    }

    private fun getOptions(): ChromeOptions {
        val options = ChromeOptions()
        options.setHeadless(true)
        options.setAcceptInsecureCerts(true)
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--no-sandbox")
        return options
    }
}