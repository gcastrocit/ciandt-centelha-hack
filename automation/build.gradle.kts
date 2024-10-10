plugins {
    kotlin("jvm")
}

group = "com.example"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.seleniumhq.selenium:selenium-java:4.0.0")
    testImplementation("com.codeborne:selenide:5.20.1")
    testImplementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
    testImplementation("org.jetbrains.kotlin:kotlin-reflect:1.5.31")
    testImplementation("io.kotest:kotest-runner-junit5:4.6.1")
    testImplementation("io.kotest:kotest-assertions-core:4.6.1")
    testImplementation("io.kotest:kotest-property:4.6.1")
    testImplementation("org.amshove.kluent:kluent:1.68")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.9.2")
}
tasks.test {
    useJUnitPlatform()
}