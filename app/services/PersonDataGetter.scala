package services

import Models.PersonDetails

class PersonDataGetter {

  def personData(username:String):PersonDetails={
    val user=PersonService.personList.filter(_.username==username)
    user.head
  }

}
