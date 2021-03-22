object Dependencies {
    object Kotlin {
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin.kotlin}"
        const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Kotlin.coroutine}"
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

    object JetPack {
        object Room {
            const val runtime = "androidx.room:room-runtime:${Versions.JetPack.room}"
            const val compiler = "androidx.room:room-compiler:${Versions.JetPack.room}"
            const val ktx = "androidx.room:room-ktx:${Versions.JetPack.room}"
        }
    }

    object Dagger {
        const val hiltCore = "com.google.dagger:hilt-android:${Versions.Dagger.hilt}"
        const val annotationProcessor = "com.google.dagger:hilt-compiler:${Versions.Dagger.hilt}"
        const val classPath = "com.google.dagger:hilt-android-gradle-plugin:${Versions.Dagger.hilt}"
    }

    object Test {
        const val jUnit = "junit:junit:${Versions.Test.jUnit}"
    }

    object AndroidTest {
        const val jUnit = "androidx.test.ext:junit:${Versions.AndroidTest.jUnit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.AndroidTest.espresso}"
    }
}