package selfup.me.kotlin.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KemoApplication

fun main(args: Array<String>) {
	runApplication<KemoApplication>(*args)
}
