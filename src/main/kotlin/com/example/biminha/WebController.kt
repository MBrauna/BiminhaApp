package com.example.biminha

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/teste")
class WebController {

    @GetMapping
    fun getTeste(): Map<String, Any> {
        return mapOf("teste" to 123)
    }
}
