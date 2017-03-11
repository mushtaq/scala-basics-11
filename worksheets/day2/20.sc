
val xs = 1 :: 2 :: 3 :: Nil

def length(list: List[Int]): Int = list match {
  case Nil          => 0
  case head :: tail => 1 + length(tail)
}


val first :: second :: rest = xs
val List(f, s, t) = xs

