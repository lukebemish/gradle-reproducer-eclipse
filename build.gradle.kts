plugins {
    id("java-library")
}

dependencies {
    compileOnly(project(":subproject"))
}