import ext.child
import ext.fileWriter
import ext.newLine

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
    val shouldMakeApk = rootProject.file("upload-keystore.jks").exists()
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
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            if (shouldMakeApk) {
                signingConfig = signingConfigs.create("release")
            }
        }
        getByName("debug") {
            versionNameSuffix = "(debug)"
        }
    }
    if (shouldMakeApk) {
        signingConfigs {
            getByName("release") {
                // https://qiita.com/hkusu/items/cadb572c979c4d729567
                storeFile = rootProject.file("upload-keystore.jks")
                storePassword = System.getenv("KEYSTORE_PASSWORD")
                keyAlias = System.getenv("KEY_ALIAS")
                keyPassword = System.getenv("KEY_PASSWORD")
            }
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
    // Kotlin
    implementation(Dependencies.Kotlin.kotlin)
    implementation(Dependencies.Kotlin.coroutine)

    // AndroidX
    implementation(Dependencies.Androidx.coreKtx)
    implementation(Dependencies.Androidx.appCompat)
    implementation(Dependencies.Androidx.material)
    implementation(Dependencies.Androidx.constraintLayout)
    implementation(Dependencies.Androidx.coordinatorLayout)
    implementation(Dependencies.Androidx.Lifecycle.ktx)
    implementation(Dependencies.Androidx.Lifecycle.commonJava8)

    // Dagger
    implementation(Dependencies.Dagger.hiltCore)
    kapt(Dependencies.Dagger.annotationProcessor)
    implementation(Dependencies.JetPack.Room.runtime)
    kapt(Dependencies.JetPack.Room.compiler)

    // JetPack
    implementation(Dependencies.JetPack.Room.ktx)
    implementation(Dependencies.JetPack.Fragment.ktx)
    implementation(Dependencies.JetPack.Activity.ktx)

    // Threeten
    implementation(Dependencies.ThirdParty.threeTenAbp)

    // Groupie
    implementation(Dependencies.ThirdParty.Groupie.core)
    implementation(Dependencies.ThirdParty.Groupie.databinding)

    // OssLicense
    implementation(Dependencies.Google.ossLicenses)

    // Firebase
    implementation(platform(Dependencies.Google.Firebase.bom))
    implementation(Dependencies.Google.Firebase.crashlytics)

    // Test
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.AndroidTest.jUnit)
    androidTestImplementation(Dependencies.AndroidTest.espresso)
}

// 自動登録されないOSSライセンスを追加するタスク
tasks.register("addOssLicenseTask") {
    mustRunAfter(tasks.findByName("generateLicenses"))
    doLast {
        project.addOssLicense(
            "Noto Sans CJK JP",
            """
This Font Software is licensed under the SIL Open Font License,
Version 1.1.

This license is copied below, and is also available with a FAQ at:
http://scripts.sil.org/OFL

-----------------------------------------------------------
SIL OPEN FONT LICENSE Version 1.1 - 26 February 2007
-----------------------------------------------------------

PREAMBLE
The goals of the Open Font License (OFL) are to stimulate worldwide
development of collaborative font projects, to support the font
creation efforts of academic and linguistic communities, and to
provide a free and open framework in which fonts may be shared and
improved in partnership with others.

The OFL allows the licensed fonts to be used, studied, modified and
redistributed freely as long as they are not sold by themselves. The
fonts, including any derivative works, can be bundled, embedded,
redistributed and/or sold with any software provided that any reserved
names are not used by derivative works. The fonts and derivatives,
however, cannot be released under any other type of license. The
requirement for fonts to remain under this license does not apply to
any document created using the fonts or their derivatives.

DEFINITIONS
"Font Software" refers to the set of files released by the Copyright
Holder(s) under this license and clearly marked as such. This may
include source files, build scripts and documentation.

"Reserved Font Name" refers to any names specified as such after the
copyright statement(s).

"Original Version" refers to the collection of Font Software
components as distributed by the Copyright Holder(s).

"Modified Version" refers to any derivative made by adding to,
deleting, or substituting -- in part or in whole -- any of the
components of the Original Version, by changing formats or by porting
the Font Software to a new environment.

"Author" refers to any designer, engineer, programmer, technical
writer or other person who contributed to the Font Software.

PERMISSION & CONDITIONS
Permission is hereby granted, free of charge, to any person obtaining
a copy of the Font Software, to use, study, copy, merge, embed,
modify, redistribute, and sell modified and unmodified copies of the
Font Software, subject to the following conditions:

1) Neither the Font Software nor any of its individual components, in
Original or Modified Versions, may be sold by itself.

2) Original or Modified Versions of the Font Software may be bundled,
redistributed and/or sold with any software, provided that each copy
contains the above copyright notice and this license. These can be
included either as stand-alone text files, human-readable headers or
in the appropriate machine-readable metadata fields within text or
binary files as long as those fields can be easily viewed by the user.

3) No Modified Version of the Font Software may use the Reserved Font
Name(s) unless explicit written permission is granted by the
corresponding Copyright Holder. This restriction only applies to the
primary font name as presented to the users.

4) The name(s) of the Copyright Holder(s) or the Author(s) of the Font
Software shall not be used to promote, endorse or advertise any
Modified Version, except to acknowledge the contribution(s) of the
Copyright Holder(s) and the Author(s) or with their explicit written
permission.

5) The Font Software, modified or unmodified, in part or in whole,
must be distributed entirely under this license, and must not be
distributed under any other license. The requirement for fonts to
remain under this license does not apply to any document created using
the Font Software.

TERMINATION
This license becomes null and void if any of the above conditions are
not met.

DISCLAIMER
THE FONT SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO ANY WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT
OF COPYRIGHT, PATENT, TRADEMARK, OR OTHER RIGHT. IN NO EVENT SHALL THE
COPYRIGHT HOLDER BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
INCLUDING ANY GENERAL, SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL
DAMAGES, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF THE USE OR INABILITY TO USE THE FONT SOFTWARE OR FROM
OTHER DEALINGS IN THE FONT SOFTWARE.
            """.trimIndent()
        )
    }
}

fun Project.addOssLicense(libName: String, licenseContent: String) {
    val outputDir = File(buildDir, "generated/third_party_licenses")
        .child("res")
        .child("raw")
    // ライセンスファイル
    val licensesFile = File(outputDir, "third_party_licenses")
    // ライセンスファイルへの書き込み前に現在の位置を保持
    val start = licensesFile.length()

    // ライセンスファイルへ書き込み
    licensesFile.fileWriter(true).use {
        it.write(licenseContent)
        it.newLine()
    }

    // ライセンスメタデータファイルに書き込み
    File(outputDir, "third_party_license_metadata").fileWriter(true).use {
        it.write("${start}:${licenseContent.length} $libName")
        it.newLine()
    }
}

// preBuild前にライセンス情報を追加する
checkNotNull(tasks.findByPath(":android:preBuild"))
    .dependsOn("addOssLicenseTask")