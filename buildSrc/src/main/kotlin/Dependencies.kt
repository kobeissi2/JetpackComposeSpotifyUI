object Dependencies {
    
    val implementations = Versions.Implementations.run {
        arrayListOf<String>().apply {
            add("org.jetbrains.kotlin:kotlin-stdlib:$kotlin")
            add("androidx.core:core-ktx:$coreKtx")
            add("androidx.appcompat:appcompat:$appcompat")
            add("androidx.compose.ui:ui:$compose")
            // Tooling support (Previews, etc.)
            // TODO: Go back to $compose when upgrading android studio
            add("androidx.compose.ui:ui-tooling:1.0.0-beta09")
            add("androidx.compose.runtime:runtime:$compose")
            // Adds support for setContent in activities
            add("androidx.activity:activity-compose:$activityCompose")
            // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
            add("androidx.compose.foundation:foundation:$compose")
            // Material Design
            add("androidx.compose.material:material:$compose")
            // Material design icons
            add("androidx.compose.material:material-icons-core:$compose")
            add("androidx.compose.material:material-icons-extended:$compose")
            // Navigation Architecture
            add("androidx.navigation:navigation-compose:$navigation")
        }
    }

    val testImplementations = Versions.TestImplementations.run {
        arrayListOf<String>().apply {
            add("junit:junit:$junit")
        }
    }

    val androidTestImplementations = Versions.AndroidTestImplementations.run {
        arrayListOf<String>().apply {
            add("androidx.test.ext:junit:$extJunit")
            add("androidx.test.espresso:espresso-core:$espresso")
            add("androidx.compose.ui:ui-test-junit4:$compose")
        }
    }

    val appPlugins = arrayListOf<String>().apply {
        add("com.android.application")
        add("kotlin-android")
    }

    val rootPlugins = Versions.Plugins.run {
        arrayListOf<String>().apply {
            add("com.android.tools.build:gradle:$buildGradle")
            add("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin")
        }
    }
}