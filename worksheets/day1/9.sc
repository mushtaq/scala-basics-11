
def reverse(xs: List[Int]): List[Int] =
  xs.foldLeft(List.empty[Int])((acc, elm) => elm :: acc)

reverse(List(1, 2, 3, 4))


val xs = List(1, 2, 3)

xs.head
val ys = xs.tail


ys.head
val zs = ys.tail

zs.head
val emptyList = zs.tail

///////////

val zs1 = zs.head :: Nil
val ys1 = ys.head :: zs1
val xs1 = xs.head :: ys1

