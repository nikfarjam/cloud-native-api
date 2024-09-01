package com.mehdi.converter.rest

import com.mehdi.converter.model.NodeInformation
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/about")
class AboutControler {
    @GetMapping
    fun index() = NodeInformation("3.0.0", "August 3, 2024")
}