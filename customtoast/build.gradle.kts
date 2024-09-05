plugins {
    id("com.android.library")
    id("maven-publish")
}

android {
    namespace = "com.hakimasmui.customtoast"
    compileSdk = 34

    defaultConfig {
        minSdk = 21

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

dependencies {

}
publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.github.hakimasmui"
            artifactId = "customtoast"
            version = "1.1.1"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}