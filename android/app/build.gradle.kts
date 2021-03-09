plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
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
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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
    implementation(Dependencies.Dagger.core)
    kapt(Dependencies.Dagger.annotationProcessor)
    implementation(Dependencies.Dagger.Android.core)
    implementation(Dependencies.Dagger.Android.support)
    kapt(Dependencies.Dagger.Android.annotationProcessor)
    implementation(Dependencies.JetPack.Room.runtime)
    kapt(Dependencies.JetPack.Room.compiler)
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.AndroidTest.jUnit)
    androidTestImplementation(Dependencies.AndroidTest.espresso)
}