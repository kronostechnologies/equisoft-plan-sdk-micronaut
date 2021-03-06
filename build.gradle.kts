group = "com.equisoft.plan.sdk"
version = "latest"

val localBuild = file("local.build.gradle.kts")
if (localBuild.exists()) {
    apply(from = localBuild)
}

plugins {
    id("io.micronaut.library") version "2.0.2"
}

repositories {
    mavenCentral()
}

dependencies {
    api("io.micronaut:micronaut-http-client")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.1")
    testImplementation("io.micronaut.security:micronaut-security-jwt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_13
    targetCompatibility = JavaVersion.VERSION_13
}

micronaut {
    version.set("2.5.11")
}

tasks {
    test {
        useJUnitPlatform()
    }

    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "7.5"
    }
}
