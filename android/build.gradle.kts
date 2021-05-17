// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = java.net.URI.create("https://jitpack.io") }
    }
    dependencies {
        classpath(Dependencies.Gradle.gradlePlugin)
        classpath(Dependencies.Gradle.kotlinGradlePlugin)
        classpath(Dependencies.Dagger.classPath)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = java.net.URI.create("https://jitpack.io") }
    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}