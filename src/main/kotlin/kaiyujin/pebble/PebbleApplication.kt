package kaiyujin.pebble

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PebbleApplication

fun main(args: Array<String>) {
    runApplication<PebbleApplication>(*args)
}
