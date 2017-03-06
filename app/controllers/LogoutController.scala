package controllers

import play.api.mvc.{Action, Controller}


class LogoutController extends Controller{

  def logout = Action{ implicit request=>

    Redirect(routes.SignInController.signIn()).withNewSession
  }

}