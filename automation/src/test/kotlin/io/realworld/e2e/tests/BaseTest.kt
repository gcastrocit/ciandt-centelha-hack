package io.realworld.e2e.tests

import com.codeborne.selenide.Configuration
import io.realworld.e2e.config.TestConfig
import io.realworld.e2e.driver.WebDriverFactory
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

open class BaseTest {
    @BeforeEach
    fun setUp() {
        Configuration.baseUrl = TestConfig.BASE_URL
        Configuration.timeout = TestConfig.TIMEOUT
        Configuration.startMaximized = true
        WebDriverFactory.setWebDriver()
    }

    @AfterEach
    fun tearDown() {
        // Add any teardown logic if needed
    }
}