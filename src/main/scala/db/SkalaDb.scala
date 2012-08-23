package main.scala.db

class SkalaDb {

import net.liftweb.mapper.{By, DB}
import net.liftweb.db.DefaultConnectionIdentifier
import code.model._

DB.use(DefaultConnectionIdentifier) {connection => {
  User.findAll( )
}}
}