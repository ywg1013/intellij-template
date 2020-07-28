package com.github.ywg1013.intellijtemplate.services

import com.intellij.openapi.project.Project
import com.github.ywg1013.intellijtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
