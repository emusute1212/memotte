object Dependencies {
    object Kotlin {
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin.kotlin}"
        const val coroutine =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Kotlin.coroutine}"
    }

    object Gradle {
        const val gradlePlugin = "com.android.tools.build:gradle:${Versions.Gradle.gradlePlugin}"
        const val kotlinGradlePlugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.kotlin}"
    }

    object Google {
        const val ossLicensesPlugin =
            "com.google.android.gms:oss-licenses-plugin:${Versions.Google.ossLicensesPlugin}"
        const val ossLicenses =
            "com.google.android.gms:play-services-oss-licenses:${Versions.Google.ossLicenses}"
        const val googleService = "com.google.gms:google-services:${Versions.Google.googleService}"

        object Firebase {
            const val gradle =
                "com.google.firebase:firebase-crashlytics-gradle:${Versions.Google.Firebase.gradle}"
            const val bom = "com.google.firebase:firebase-bom:${Versions.Google.Firebase.bom}"
            const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
        }
    }

    object Androidx {
        const val coreKtx = "androidx.core:core-ktx:${Versions.Androidx.coreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.Androidx.appCompat}"
        const val material = "com.google.android.material:material:${Versions.Androidx.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.Androidx.constraintLayout}"
        const val coordinatorLayout =
            "androidx.coordinatorlayout:coordinatorlayout:${Versions.Androidx.coordinatorLayout}"

        object Lifecycle {
            const val ktx =
                "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.Androidx.lifecycle}"
        }
    }

    object JetPack {
        object Room {
            const val runtime = "androidx.room:room-runtime:${Versions.JetPack.room}"
            const val compiler = "androidx.room:room-compiler:${Versions.JetPack.room}"
            const val ktx = "androidx.room:room-ktx:${Versions.JetPack.room}"
        }

        object Fragment {
            const val ktx = "androidx.fragment:fragment-ktx:${Versions.JetPack.fragment}"
        }

        object Activity {
            const val ktx = "androidx.activity:activity-ktx:${Versions.JetPack.activity}"
        }
    }

    object Dagger {
        const val hiltCore = "com.google.dagger:hilt-android:${Versions.Dagger.hilt}"
        const val annotationProcessor = "com.google.dagger:hilt-compiler:${Versions.Dagger.hilt}"
        const val classPath = "com.google.dagger:hilt-android-gradle-plugin:${Versions.Dagger.hilt}"
    }

    object ThirdParty {
        const val threeTenAbp =
            "com.jakewharton.threetenabp:threetenabp:${Versions.ThirdParty.threeTenAbp}"

        object Groupie {
            const val core = "com.github.lisawray.groupie:groupie:${Versions.ThirdParty.groupie}"
            const val databinding =
                "com.github.lisawray.groupie:groupie-databinding:${Versions.ThirdParty.groupie}"
        }
    }

    object Test {
        const val jUnit = "junit:junit:${Versions.Test.jUnit}"
    }

    object AndroidTest {
        const val jUnit = "androidx.test.ext:junit:${Versions.AndroidTest.jUnit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.AndroidTest.espresso}"
    }
}