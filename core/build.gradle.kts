
plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("org.kodein.mock.mockmp")
}

group = "com.example"

mockmp {
    usesHelper = true
}

kotlin {
    @Suppress("OPT_IN_USAGE")
    targetHierarchy.default()
    jvm {
        jvmToolchain(11)
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    mingwX64()
    linuxX64()
    macosX64()
    macosArm64()

    @Suppress("UNUSED_VARIABLE")
    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
