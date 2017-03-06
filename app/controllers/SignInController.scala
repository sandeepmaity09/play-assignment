package controllers

import Models.LoginMapping
import services.PersonService
import play.api.mvc._

class SignInController extends Controller {

  def signIn = Action {
    Ok(views.html.signinpage())
  }

  def signInProcess = Action { implicit request =>
    val(name,passwd) = LoginMapping.LoginDetailsForm.bindFromRequest.get
    if(personList.checkUs)

}
