package kaiyujin.pebble.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheck {
    @GetMapping("")
    fun index(): String {
        return "OK"
    }
}