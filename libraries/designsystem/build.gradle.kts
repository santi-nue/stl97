plugins {
    id("com.ebdz.compose.gradleplugin.android.library")
    id("com.ebdz.compose.gradleplugin.android.kotlin")
    id("com.ebdz.compose.gradleplugin.di")
    id("com.ebdz.compose.gradleplugin.library.compose")
}

android {
    namespace = "com.ebdz.libraries.designsystem"
}

dependencies {
    testImplementation(project(":libraries:test"))
}
