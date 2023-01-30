package br.com.mymemories.domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserTest {

    @Test
    fun testInstanceOfUser() {
        val user = User("Eduarda")

        Assertions.assertNotNull(user)
    }
}
