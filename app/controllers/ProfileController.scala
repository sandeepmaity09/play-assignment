package controllers

import Models.PersonDetails
import play.api.mvc._
import services.PersonDataGetter

class ProfileController extends Controller {

  def profile = Action { implicit request =>
    request.session.get("username").map{ username =>
    val person = new PersonDataGetter
    val personData = person.userData(username)
    Ok(views.html.profile(personData))
  }.getOrElse {
    Unauthorized("Something went wrong")
  }

}
