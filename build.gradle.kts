buildscript {
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.42")
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.4.0-rc01" apply false
    id("com.android.library") version "7.4.0-rc01" apply false
    id("org.jetbrains.kotlin.android") version "1.7.0" apply false
}