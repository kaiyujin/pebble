package kaiyujin.pebble.controller

import kaiyujin.pebble.entity.Sample
import kaiyujin.pebble.service.SampleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sample")
class SampleController(
    val sampleService: SampleService
) {
    @GetMapping("")
    fun list(): List<Sample> {
        return sampleService.findAll()
    }
}