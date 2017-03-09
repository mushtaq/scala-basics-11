

def square(x: Int): Int = x * x
def add(x: Int, y: Int) = x + y

val squareF: Int => Int = x => x * x
val squareF2: Int => Int = square
val squareF3 = square _

val addF: (Int, Int) => Int = (x, y) => x + y

square(10)

squareF.apply(10)

squareF(10)

