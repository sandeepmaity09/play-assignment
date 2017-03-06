package controllers

import Models._
import services.{PersonAuth}
import play.api.mvc._

class SignInController extends Controller {

  def signIn = Action {
    Ok(views.html.signinpage())
  }

  def signInProcess = Action { implicit request =>
    LogingDetailsMapping.LogingDetailsForm.bindFromRequest.fold(
      formWithErrors => {
        Redirect(routes.SignInController.signIn()).flashing(
          "error" -> "Something went wrong Please Try Again Later"
        )
      },
      person => {
        val flag:Boolean = PersonAuth.check(person)
        if(flag)
          Redirect(routes.ProfilController.profile()).withSession(
            "username" -> person.username
          )
        else {
          Redirect(routes.SignInController.signIn()).flashing(
            "error" -> "Username and password wrong"
          )
        }
      }
    )
  }
}
