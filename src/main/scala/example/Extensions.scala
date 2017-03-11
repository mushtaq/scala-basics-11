package example

object Extensions {

  case class Meter(value: Int) extends AnyVal {
    def +(other: Meter) = Meter(value + other.value)
  }

  implicit class RichString(val x: String) extends AnyVal {
    def hello = s"hello $x"
  }

}
