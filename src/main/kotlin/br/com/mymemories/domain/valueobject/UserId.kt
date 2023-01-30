package br.com.mymemories.domain.valueobject
import br.com.mymemories.common.valueobject.indentifier.Identifier
import java.util.UUID


class UserId(
    private val value: String
) : Identifier() {
    companion object {
        fun unique(): UserId {
            return UserId.from(UUID.randomUUID().toString())
        }

        fun from(id: String): UserId {
            return UserId(id)
        }
    }
}