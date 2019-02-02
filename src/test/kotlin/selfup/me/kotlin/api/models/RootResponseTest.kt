package selfup.me.kotlin.api.models

import org.junit.Test
import org.junit.Assert.*

class RootResponseTest {
    @Test
    fun getMessage() {
        val rootResponse =  RootResponse("hello world")

        assertEquals("hello world", rootResponse.message)
    }
}