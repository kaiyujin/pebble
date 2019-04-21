package kaiyujin.pebble.service

import kaiyujin.pebble.entity.Sample
import kaiyujin.pebble.repository.SampleRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SampleService(
    private val sampleRepository: SampleRepository
) {
    fun findAll(): List<Sample> {
        return sampleRepository.findAll()
    }

    fun findByName(name: String): Sample {
        return sampleRepository.findByName(name)
    }

    @Transactional
    fun create(sample: Sample): Sample {
        return sampleRepository.create(sample).entity
    }
}