object Versions {
    object Kotlin {
        const val kotlin = "1.5.0"
        const val coroutine = "1.5.0"
    }

    object Gradle {
        const val gradlePlugin = "7.0.0"
    }

    object Google {
        const val ossLicensesPlugin = "0.10.4"
        const val ossLicenses = "17.0.0"
        const val googleService = "4.3.8"

        object Firebase {
            const val gradle = "2.7.1"
            const val bom = "28.2.0"
        }
    }

    object Memotte {
        const val compileSdk = 30
        const val targetSdk = 30
        const val minSdk = 23

        private val version = ApplicationVersion(1, 0, 0, 0)
        val code = version.code
        val name = version.name
    }

    object Androidx {
        const val coreKtx = "1.3.2"
        const val appCompat = "1.2.0"
        const val material = "1.3.0"
        const val constraintLayout = "2.0.4"
        const val coordinatorLayout = "1.1.0"
        const val lifecycle = "2.2.0"
    }

    object JetPack {
        const val room = "2.2.6"
        const val fragment = "1.3.3"
        const val activity = "1.2.3"
    }

    object Dagger {
        const val hilt = "2.38.1"
    }

    object ThirdParty {
        const val threeTenAbp = "1.3.0"
        const val groupie = "2.9.0"
    }

    object Test {
        const val jUnit = "4.13.2"
    }

    object AndroidTest {
        const val jUnit = "1.1.2"
        const val espresso = "3.3.0"
    }
}