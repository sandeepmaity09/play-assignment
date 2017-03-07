package services

import Models.PersonDetails
import scala.collection.mutable.ListBuffer

object PersonService {

  val personList:ListBuffer[PersonDetails] = ListBuffer[PersonDetails]()

  def addPerson(person:PersonDetails) = personList+=person


}

