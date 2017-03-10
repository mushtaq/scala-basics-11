{}

sealed trait Color

object Color {
  case object Red extends Color
  case object Green extends Color
  case object Blue extends Color
}

Color.Red


sealed trait Day

object Day {
  case object Weekday extends Day
  case object Weekend extends Day
}
