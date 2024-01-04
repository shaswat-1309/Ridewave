pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://kommunicate.jfrog.io/artifactory/kommunicate-android-sdk") }
    }
}

rootProject.name = "RideWave"
include(":app")
 