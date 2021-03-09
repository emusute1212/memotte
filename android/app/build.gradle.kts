plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(Versions.Memotte.compileSdk)

    defaultConfig {
        applicationId = "io.github.emusute1212.memotte.android"
        minSdkVersion(Versions.Memotte.minSdk)
        targetSdkVersion(Versions.Memotte.targetSdk)
        versionCode = Versions.Memotte.code
        versionName = Versions.Memotte.name

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Dependencies.Kotlin.kotlin)
    implementation(Dependencies.Androidx.coreKtx)
    implementation(Dependencies.Androidx.appCompat)
    implementation(Dependencies.Androidx.material)
    implementation(Dependencies.Androidx.constraintLayout)
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.AndroidTest.jUnit)
    androidTestImplementation(Dependencies.AndroidTest.espresso)
}