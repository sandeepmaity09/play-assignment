package services

import Models.{LogingDetails}
/**
  * Created by ghost on 7/3/17.
  */
object PersonAuth {

  def check(person:LogingDetails):Boolean={
    val listpwdnotmatch = PersonService.personList.map(
      value=>(value.username,value.passwd)
    )

    if(listpwdnotmatch.contains((person.username,person.passwd)))
      true
    else
      false
  }
}
