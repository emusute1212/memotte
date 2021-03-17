object Versions {
    object Kotlin {
        const val kotlin = "1.4.31"
    }

    object Gradle {
        const val gradlePlugin = "4.1.2"
    }

    object Memotte {
        const val compileSdk = 29
        const val targetSdk = 29
        const val minSdk = 23

        private val version = ApplicationVersion(0, 0, 0, 1)
        val code = version.code
        val name = version.name
    }

    object Androidx {
        const val coreKtx = "1.3.2"
        const val appCompat = "1.2.0"
        const val material = "1.3.0"
        const val constraintLayout = "2.0.4"
    }

    object JetPack {
        const val room = "2.2.6"
    }

    object Dagger {
        const val hilt = "2.33-beta"
    }

    object Test {
        const val jUnit = "4.13.2"
    }

    object AndroidTest {
        const val jUnit = "1.1.2"
        const val espresso = "3.3.0"
    }
}