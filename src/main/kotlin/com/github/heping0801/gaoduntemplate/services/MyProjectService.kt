package com.github.heping0801.gaoduntemplate.services

import com.github.heping0801.gaoduntemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
