package br.com.mymemories.common.entity

import br.com.mymemories.common.valueobject.indentifier.Identifier

abstract class AggregateRoot<ID : Identifier> constructor(id: ID) : BaseEntity<ID>(id){
}