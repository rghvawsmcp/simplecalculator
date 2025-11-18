plugins {
    alias(libs.plugins.android).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.ksp).apply(false)
    id("org.sonarqube") version "7.0.1.6134"
}

sonar {
  properties {
    property("sonar.projectKey", "rghvawsmcp_simplecalculator")
    property("sonar.organization", "rghvawsmcp")
  }
}
