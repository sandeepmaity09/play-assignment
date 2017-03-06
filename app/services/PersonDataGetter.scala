package services

import Models.PersonDetails

class PersonDataGetter {

  def userData(username:String):PersonDetails={
    val user=PersonService.personList.filter(_.username==username)
    user.head
  }

}
