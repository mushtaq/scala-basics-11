package example

object S {

  def sort[T](xs: List[T])(ord: Ord[T]): List[T] = xs match {
    case Nil          => Nil
    case head :: tail => insert(head, sort(tail)(ord))(ord)
  }

  private def insert[T](x: T, xs: List[T])(ord: Ord[T]): List[T] = xs match {
    case Nil                             => List(x)
    case head :: tail if ord.lte(x, head) => x :: head :: tail
    case head :: tail                     => head :: insert(x, tail)(ord)
  }

}
