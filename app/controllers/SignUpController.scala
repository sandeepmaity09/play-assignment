package controllers

import play.api.mvc._

class SignUpController extends Controller {

  def signUp = Action {
    Ok(views.html.signuppage())
  }

}
