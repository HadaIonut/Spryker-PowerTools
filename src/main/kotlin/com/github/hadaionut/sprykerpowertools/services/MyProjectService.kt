package com.github.hadaionut.sprykerpowertools.services

import com.intellij.openapi.project.Project
import com.github.hadaionut.sprykerpowertools.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
