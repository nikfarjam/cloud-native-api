package com.mehdi.converter.rest

import com.mehdi.converter.model.NodeInformation
import com.mehdi.converter.service.AboutService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/about")
class AboutControler constructor(val aboutService: AboutService){
    @GetMapping
    fun index() = NodeInformation(aboutService.appVersion, aboutService.appReleaseDate)
}