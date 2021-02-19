package com.github.xyz3r.stencilcomponentssupport.services

import com.github.xyz3r.stencilcomponentssupport.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
