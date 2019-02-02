package selfup.me.kotlin.api.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import selfup.me.kotlin.api.models.RootResponse

@RestController
class Root {
    @Value("\${app.root.message}")
    val message: String = ""

    @GetMapping("/api")
    fun root() = RootResponse(message);
}
