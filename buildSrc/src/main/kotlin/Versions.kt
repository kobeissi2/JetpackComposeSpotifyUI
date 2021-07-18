object Versions {
    object Plugins {
        const val buildGradle = "7.1.0-alpha03"
        const val kotlin = "1.5.10"
    }

    object Implementations {
        const val coreKtx = "1.7.0-alpha01"
        const val appcompat = "1.4.0-alpha03"
        const val navigation = "2.4.0-alpha04"
        const val compose = "1.0.0-rc01"
        const val activityCompose = "1.3.0-rc01"
        const val kotlin = Plugins.kotlin
        const val accompanist = "0.14.0"
        const val coil = "1.3.0"
    }

    object TestImplementations {
        const val junit = "4.13.2"
    }

    object AndroidTestImplementations {
        const val extJunit = "1.1.3"
        const val espresso = "3.4.0"
        const val compose = Implementations.compose
    }
}