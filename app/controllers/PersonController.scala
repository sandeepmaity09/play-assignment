package controllers

import models.PersonDetailsMapping
import play.api.libs.json.{Json,OFormat}
import play.api.mvc._
import services.PersonService

class PersonController extends Controller {

  def addPersonDetails = Action { implicit request =>
    val person = PersonDetailsMapping.personDetailsForm.bindFromRequest.get

    println(person.fName+"\n"+person.mName+"\n"+person.lName+"\n"+person.username+"\n"+person.passwd+"\n"+
            person.mobile+"\n"+person.gender+"\n"+person.age+"\n"+person.hobbies)
    PersonService.personList+=person
    Redirect(routes.SignInController.signIn())
  }

  def getPersonDetails = Action { implicit request =>
    val person = PersonService.personList.toList
    val personJson = Json.toJson(person)
    println(personJson)
//    Ok(person)
    ???
  }

}
