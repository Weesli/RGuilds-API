plugins {
    id("java")
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.spigotmc:spigot-api:1.21.1-R0.1-SNAPSHOT")
    compileOnly("org.projectlombok:lombok:1.18.28")
    annotationProcessor("org.projectlombok:lombok:1.18.28")
    compileOnly("org.jetbrains:annotations:23.0.0")
    annotationProcessor("org.jetbrains:annotations:23.0.0")
    implementation("com.google.guava:guava:32.1.2-jre") {
        because("avoid resolution conflict on JitPack")
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks {
    jar {
        archiveBaseName.set("RGuilds-API")
        archiveClassifier.set("")
        archiveVersion.set("3.0.1")
    }
    build{
        dependsOn(jar)
    }
}


configurations.all {
    resolutionStrategy.eachDependency {
        if (requested.group == "com.google.guava" && requested.name == "guava") {
            useTarget("com.google.guava:guava:32.1.2-jre")
        }
    }
}