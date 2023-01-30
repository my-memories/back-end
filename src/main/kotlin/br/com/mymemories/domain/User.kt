package br.com.mymemories.domain

import br.com.mymemories.common.entity.BaseEntity
import br.com.mymemories.domain.valueobject.UserId

class User(
    id: UserId,
    val name: String,

) : BaseEntity<UserId>(id) {

}
