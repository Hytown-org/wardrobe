plugins {
    id("java")
    id("hytown.publishing") version "+"
    id("hytown.build") version "+"
    `maven-publish`
}

group = "dev.hardaway"
version = "0.3.10-pre"
description = "Enables creators to add customizable cosmetics, such as hairstyles, accessories, clothing, and custom player models, into Hytale with asset packs."

base.archivesName = "Wardrobe"

java {
    sourceCompatibility = JavaVersion.VERSION_25
    targetCompatibility = JavaVersion.VERSION_25
    toolchain.languageVersion = JavaLanguageVersion.of(25)
}
