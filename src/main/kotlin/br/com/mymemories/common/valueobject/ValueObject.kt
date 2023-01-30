package br.com.mymemories.common.valueobject

abstract class ValueObject {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ValueObject) return false
        return false
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}
