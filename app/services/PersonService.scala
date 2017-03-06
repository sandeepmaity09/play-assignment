package services

import Models.PersonDetails
import scala.collection.mutable.ListBuffer

object PersonService {

  val personList:ListBuffer[PersonDetails] = ListBuffer[PersonDetails]()

  def addPerson(person:PersonDetails)={
    personList.append(person)
  }

  def getPerson(username:String,passwd:String):PersonDetails = {
    personList.filter(person => (person.username = username) && (person.passwd == passwd))(0)
    ???
  }

  def checkPerson(username:String,passwd:String):Boolean ={
    personList.filter(person => (person.username == username) && (person.username == passwd)).length == 1
  }

}

