package example

object WrongSorter {

  def sort[T <: Orderable[T]](xs: List[T]): List[T] = xs match {
    case Nil          => Nil
    case head :: tail => insert(head, sort(tail))
  }

  private def insert[T <: Orderable[T]](x: T, xs: List[T]): List[T] = xs match {
    case Nil                       => List(x)
    case head :: tail if x <= head => x :: head :: tail
    case head :: tail              => head :: insert(x, tail)
  }

}
