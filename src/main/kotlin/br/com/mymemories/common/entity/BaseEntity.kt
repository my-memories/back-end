package br.com.mymemories.common.entity

import br.com.mymemories.common.valueobject.indentifier.Identifier

abstract class BaseEntity<ID: Identifier> (
    val id: ID
)