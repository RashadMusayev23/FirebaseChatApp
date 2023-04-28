buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.3.15")
        classpath("com.android.tools.build:gradle:3.4.0")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.9.5")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.0-alpha01" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}