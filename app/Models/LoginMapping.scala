package Models

import Models.PersonDetails

import play.api.data.Form
import play.api.data.Forms._

object LoginMapping {

  val LoginDetailsForm = Form {
    tuple(
      "username" -> text,
      "passwd" -> text
    )
  }

}
