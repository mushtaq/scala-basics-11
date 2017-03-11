package example

trait Ord[T] {
  def lte(a: T, b: T): Boolean
  def eqs(a: T, b: T): Boolean = lte(a, b) && lte(b, a)
}

object Ord {

  def apply[T](implicit x: Ord[T]): Ord[T] = x

  implicit val intOrd: Ord[Int] = (a: Int, b: Int) => a <= b

  implicit val strOrd: Ord[String] = (a: String, b: String) => a <= b

  implicit def optOrd[T](implicit ord: Ord[T]): Ord[Option[T]] = (a: Option[T], b: Option[T]) => (a, b) match {
    case (Some(x), Some(y)) => ord.lte(x, y)
    case (None, _)          => true
    case (_, None)          => false
  }

  implicit def pairOrd[T1, T2](implicit ord1: Ord[T1], ord2: Ord[T2]): Ord[(T1, T2)] = (a: (T1, T2), b: (T1, T2)) =>
    if (ord1.eqs(a._1, b._1)) ord2.lte(a._2, b._2)
    else ord1.lte(a._1, b._1)

}
