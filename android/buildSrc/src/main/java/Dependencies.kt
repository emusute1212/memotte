object Dependencies {
    object Kotlin {
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin.kotlin}"
    }

    object Gradle {
        const val gradlePlugin = "com.android.tools.build:gradle:${Versions.Gradle.gradlePlugin}"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.kotlin}"
    }

    object Androidx {
        const val coreKtx = "androidx.core:core-ktx:${Versions.Androidx.coreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.Androidx.appCompat}"
        const val material = "com.google.android.material:material:${Versions.Androidx.material}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.Androidx.constraintLayout}"
    }

    object Test {
        const val jUnit = "junit:junit:${Versions.Test.jUnit}"
    }

    object AndroidTest {
        const val jUnit = "androidx.test.ext:junit:${Versions.AndroidTest.jUnit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.AndroidTest.espresso}"
    }
}