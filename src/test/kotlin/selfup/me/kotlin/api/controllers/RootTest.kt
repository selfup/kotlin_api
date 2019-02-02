package selfup.me.kotlin.api.controllers

import org.junit.Test

import org.junit.Assert.*
import org.springframework.test.util.ReflectionTestUtils.setField
import selfup.me.kotlin.api.models.RootResponse

class RootTest {

    @Test
    fun defaultRoot() {
        val rootResponse: RootResponse = Root().root()

        assertEquals("", rootResponse.message)
    }

    @Test
    fun configRoot() {
        val rootController = Root()

        setField(rootController, "message", "hello world")
        val rootResponse: RootResponse = rootController.root()

        assertEquals("hello world", rootResponse.message)
    }
}
