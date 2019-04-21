package kaiyujin.pebble.controller

import kaiyujin.pebble.entity.Sample
import kaiyujin.pebble.service.SampleService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/sample")
class SampleController(
    val sampleService: SampleService
) {
    @GetMapping("")
    fun list(): List<Sample> {
        return sampleService.findAll()
    }

    @GetMapping("/{name}")
    fun findByName(@PathVariable("name") name: String): Sample {
        return sampleService.findByName(name)
    }

    @PostMapping("")
    fun create(@RequestBody @Validated sample: Sample): Sample {
        return sampleService.create(sample)
    }
}