plugins {
    id("java")
    id("hytown.publishing") version "0.3.5"
    id("hytown.build") version "0.3.5"
    `maven-publish`
}

group = "dev.hardaway"
version = "0.3.11-pre-update7.1"
description = "Enables creators to add customizable cosmetics, such as hairstyles, accessories, clothing, and custom player models, into Hytale with asset packs."

base.archivesName = "Wardrobe"

java {
    sourceCompatibility = JavaVersion.VERSION_25
    targetCompatibility = JavaVersion.VERSION_25
    toolchain.languageVersion = JavaLanguageVersion.of(25)
}

// Re-expand the manifest whenever either deployment version changes.
tasks.withType<ProcessResources>().configureEach {
    inputs.property("hytaleVersion", providers.gradleProperty("hytown.build.hytale.version"))
    inputs.property("pluginVersion", provider { project.version.toString() })
}
