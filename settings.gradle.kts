rootProject.name = "equisoft-plan-sdk-micronaut"

val localSettings = file("local.settings.gradle.kts")
if (localSettings.exists()) {
    apply(from = localSettings)
}
