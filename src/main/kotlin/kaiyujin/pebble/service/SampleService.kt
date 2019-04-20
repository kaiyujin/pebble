package kaiyujin.pebble.service

import kaiyujin.pebble.entity.Sample
import kaiyujin.pebble.repository.SampleRepository
import org.springframework.stereotype.Service

@Service
class SampleService(
        private val sampleRepository: SampleRepository
) {
    fun findAll(): List<Sample> {
        return sampleRepository.findAll()
    }
}