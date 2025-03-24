package com.ebdz.compose.buildsrc.tools

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

internal fun Project.configureCompose(
    extension: CommonExtension<*, *, *, *, *, *>,
) {
    val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

    extension.apply {
        buildFeatures {
            compose = true
        }

        dependencies {
            add("implementation", libs.findBundle("compose").get())
        }
    }
}
