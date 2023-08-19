import org.apache.tools.ant.taskdefs.Java
import kotlin.io.path.Path
import kotlin.system.exitProcess

plugins {
    id("java")
}

group = "dev.nisaldb"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.create<JavaExec>("play") {
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set(if (project.hasProperty("pattern")) {
        val patternName = project.property("pattern").toString()
        "dev.nisaldb.patterns.$patternName.play.Play"
    } else {
        "NULL"
    })
}