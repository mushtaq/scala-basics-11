package example

import play.api.libs.json._

object JsDemo {
  def transform(json: JsValue): JsValue = json match {
    case JsNumber(x)                         => JsNumber(x * x)
    case JsString(x) if x.startsWith("urn:") => JsString("hello " + x.stripPrefix("urn:"))
    case JsArray(xs)                         => JsArray(xs.map(transform))
    case JsObject(xs)                        => JsObject(
      xs.map {
        case (k@("m" | "n"), v) => (k, v)
        case (k, v)             => (k, transform(v))
      }
    )
    case x                                   => x
  }
}
