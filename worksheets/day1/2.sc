
trait F1 {
  def invoke(x: Int): Int
}

def square(x: Int): Int = x * x
def add(x: Int, y: Int) = x + y

val squareF: Int => Int = x => x * x
val squareF1: F1 = x => x * x
val squareF2: F1 = squareF1

val addF: (Int, Int) => Int = (x, y) => x + y

def m(f1: F1) = f1.invoke(10)

m(x => x + 1)

m(squareF)

