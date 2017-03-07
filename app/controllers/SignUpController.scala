package controllers

import Models.PersonDetails
import models.PersonDetailsMapping
import play.api.mvc._
import services.PersonService

class SignUpController extends Controller {

  def signUp = Action {
    Ok(views.html.signuppage())
  }

  def addPersonDetails = Action {implicit request =>
    PersonDetailsMapping.personDetailsForm.bindFromRequest.fold(
      formWithErrors => {
        Redirect(routes.SignUpController.signUp()).flashing(
          "error" -> "Something went wrong"
        )
      },
      personData => {
        PersonService.addPerson(personData)
        Redirect(routes.ProfileController.profile()).withSession(
          "username" -> personData.username
        )
      }
    )
  }

}
