import scala.collection.mutable

def square(x: Int): Int = x * x
def add(x: Int, y: Int) = x + y

val squareF: Int => Int = x => x * x
val addF: (Int, Int) => Int = (x, y) => x + y

squareF.apply(10)

square(10)

val xs = List(1, 2, 3, 4)

trait Predicate[S] extends (S => Boolean)


class SquareStrategy extends (Int => Int) {
  override def apply(x: Int): Int = square(x)
}

def map(xs: List[Int], f: Int => Int): List[Int] = {
  val buf = mutable.Buffer.empty[Int]
  val it = xs.iterator
  while (it.hasNext) {
    buf += f(it.next())
  }
  buf.toList
}

def squareAll(xs: List[Int]): List[Int] =
  map(xs, x => x * x)

def squareAll2(xs: List[Int]): List[Int] =
  map(xs, square)

def incrAll(xs: List[Int]): List[Int] = map(xs, new (Int => Int) {
  override def apply(x: Int): Int = x + 1
})

def incrAll2(xs: List[Int]): List[Int] = map(xs, x => x + 1)

