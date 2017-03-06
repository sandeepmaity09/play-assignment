package Models


import Models.LogingDetails

import play.api.data.Form
import play.api.data.Forms._

object LogingDetailsMapping {

  val LogingDetailsForm = Form {
    Mapping(
      "username" -> text,
      "passwd" -> text
    )(LogingDetailsMapping.apply)(LogingDetailsMapping.unapply)
  }

}
