package example

import play.api.libs.json._

object JsDemo {
  def transform(json: JsValue): JsValue = json match {
    case JsNumber(x)               => JsNumber(x * x)
    case JsString("urn" :: suffix) => JsString(s"hello $suffix")
    case JsArray(xs)               => JsArray(xs.map(transform))
    case JsObject(xs)              => JsObject(
      xs.map {
        case (k@("m" | "n"), v) => (k, v)
        case (k, v)             => (k, transform(v))
      }
    )
    case x                         => x
  }

  object :: {
    def unapply(arg: String): Option[(String, String)] = arg.split(":") match {
      case Array(user, name) => Some((user, name))
      case _                 => None
    }
  }

}




