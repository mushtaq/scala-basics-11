

def square(input: Option[Int]): Option[Int] = input match {
  case Some(x) => Some(x * x)
  case None    => None
}

square(Some(9))
square(None)

def add(x: Option[Int], y: Option[Int]): Option[Int] = (x, y) match {
  case (Some(a), Some(b)) => Some(a + b)
  case (_, None)          => x
  case (None, _)          => y
}

