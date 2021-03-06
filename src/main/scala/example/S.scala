package example

object S {

  def sort[T: Ord](xs: List[T]): List[T] = xs match {
    case Nil          => Nil
    case head :: tail => insert(head, sort(tail))
  }

  private def insert[T: Ord](x: T, xs: List[T]): List[T] = xs match {
    case Nil                                 => List(x)
    case head :: tail if Ord[T].lte(x, head) => x :: head :: tail
    case head :: tail                        => head :: insert(x, tail)
  }

}
