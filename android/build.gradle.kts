plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("com.google.android.gms.oss-licenses-plugin")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
}

android {
    compileSdk = Versions.Memotte.compileSdk

    defaultConfig {
        applicationId = "io.github.emusute1212.memotte"
        minSdk = Versions.Memotte.minSdk
        targetSdk = Versions.Memotte.targetSdk
        versionCode = Versions.Memotte.code
        versionName = Versions.Memotte.name

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            isDebuggable = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            versionNameSuffix = "(debug)"
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_11)
        targetCompatibility(JavaVersion.VERSION_11)
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    implementation(Dependencies.Kotlin.kotlin)
    implementation(Dependencies.Kotlin.coroutine)
    implementation(Dependencies.Androidx.coreKtx)
    implementation(Dependencies.Androidx.appCompat)
    implementation(Dependencies.Androidx.material)
    implementation(Dependencies.Androidx.constraintLayout)
    implementation(Dependencies.Androidx.coordinatorLayout)
    implementation(Dependencies.Androidx.Lifecycle.ktx)
    implementation(Dependencies.Androidx.Lifecycle.commonJava8)
    implementation(Dependencies.Dagger.hiltCore)
    kapt(Dependencies.Dagger.annotationProcessor)
    implementation(Dependencies.JetPack.Room.runtime)
    kapt(Dependencies.JetPack.Room.compiler)
    implementation(Dependencies.JetPack.Room.ktx)
    implementation(Dependencies.JetPack.Fragment.ktx)
    implementation(Dependencies.JetPack.Activity.ktx)
    implementation(Dependencies.ThirdParty.threeTenAbp)
    implementation(Dependencies.ThirdParty.Groupie.core)
    implementation(Dependencies.ThirdParty.Groupie.databinding)
    implementation(Dependencies.Google.ossLicenses)
    implementation(platform(Dependencies.Google.Firebase.bom))
    implementation(Dependencies.Google.Firebase.crashlytics)
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.AndroidTest.jUnit)
    androidTestImplementation(Dependencies.AndroidTest.espresso)
}