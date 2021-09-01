val composeVersion = "1.1.0-alpha03"

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android.run {
    compileSdk = 31

    defaultConfig.run {
        applicationId("com.kobeissidev.jetpackcomposespotifyui")
        minSdk = 24
        targetSdk = compileSdk
        versionCode(1)
        versionName("1.0.0")
        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    buildTypes.run {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }

    composeOptions.kotlinCompilerExtensionVersion = composeVersion
    kotlinOptions.jvmTarget = "1.8"
    buildFeatures.compose = true
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.30")
    implementation("androidx.core:core-ktx:1.7.0-alpha02")
    implementation("androidx.appcompat:appcompat:1.4.0-alpha03")
    implementation("androidx.compose.ui:ui:$composeVersion")
    // Tooling support (Previews, etc.)
    implementation("androidx.compose.ui:ui-tooling:$composeVersion")
    implementation("androidx.compose.runtime:runtime:$composeVersion")
    // implementations support for setContent in activities
    implementation("androidx.activity:activity-compose:1.3.1")
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation("androidx.compose.foundation:foundation:$composeVersion")
    // Material Design
    implementation("androidx.compose.material:material:$composeVersion")
    // Material design icons
    implementation("androidx.compose.material:material-icons-core:$composeVersion")
    implementation("androidx.compose.material:material-icons-extended:$composeVersion")
    // Accompanist to supplement Jetpack Compose
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.17.0")
    // Navigation Architecture
    implementation("androidx.navigation:navigation-compose:2.4.0-alpha08")
    // Used for image loading
    implementation("io.coil-kt:coil-compose:1.3.2")
    // Hilt
    implementation("com.google.dagger:hilt-android:2.38.1")
    // Used for hiltViewModel()
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0-alpha03")

    testImplementation("junit:junit:4.13.2")

    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:$composeVersion")

    kapt("com.google.dagger:hilt-android-compiler:2.38.1")
}