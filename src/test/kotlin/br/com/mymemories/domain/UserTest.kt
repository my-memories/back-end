package br.com.mymemories.domain

import br.com.mymemories.domain.valueobject.UserId
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UserTest {

    @Test
    fun testInstanceOfUser() {
        val userId = UserId.unique()
        val user = User(userId, "Eduarda")

        Assertions.assertNotNull(user)
        Assertions.assertEquals("Eduarda", user.name)
    }
}
