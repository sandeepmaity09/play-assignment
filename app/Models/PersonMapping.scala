package models

import Models.PersonDetails

import play.api.data.Form
import play.api.data.Forms._

object PersonDetailsMapping {

  val personDetailsForm : Form[PersonDetails] = Form {
    mapping(
      "fName" -> text,
      "mName" -> text,
      "lName" -> text,
      "email" -> text,
      "username" -> text,
      "passwd" -> text,
      "mobile" -> number,
      "gender" -> text,
      "age" -> number(min=18,max=75),
      "hobbies" -> text
    )(PersonDetails.apply)(PersonDetails.unapply)
  }
}