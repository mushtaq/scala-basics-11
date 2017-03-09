import scala.collection.mutable

def map(xs: List[Int], f: Int => Int): List[Int] = {
  val buf = mutable.Buffer.empty[Int]
  val it = xs.iterator
  while (it.hasNext) {
    buf += f(it.next())
  }
  buf.toList
}

def map2(xs: List[Int], f: Int => Int): List[Int] = {
  var list = List.empty[Int]
  val it = xs.iterator
  while (it.hasNext) {
    list = f(it.next()) :: list
  }
  list.reverse
}

map(List(1, 2, 3, 4), x => x * x)
map2(List(1, 2, 3, 4), x => x * x)
