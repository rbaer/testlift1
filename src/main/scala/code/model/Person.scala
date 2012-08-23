package main.scala.code.model

package net.liftweb {
package example {
package model {

import _root_.net.liftweb._
import mapper._
import common._
import util._

object Person extends Person with LongKeyedMetaMapper[Person]

class Person extends LongKeyedMapper[Person] with IdPK {
 def getSingleton = Person

 object firstName extends MappedString(this, 100) {
   override def validations = valMinLen(2, "First name must be 2 characters long") _ :: super.validations
 }
 object lastName extends MappedString(this, 100)

 object personalityType extends MappedEnum(this, Personality)
}

object Personality extends Enumeration {
val TypeA = Value(1, "Type A")
val TypeB = Value(2, "Type B")
val ENTJ = Value(3, "ENTJ")
val INTJ = Value(4, "INTJ")

val allTypes = Array(TypeA, TypeB, ENTJ, INTJ)
def rand = allTypes(Helpers.randomInt(allTypes.length))
}
}
}
}