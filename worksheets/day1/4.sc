val xs = List(1, 2, 3, 4)

def fold[Acc](xs: List[Int], seed: Acc)(f: (Acc, Int) => Acc): Acc = {
  var result: Acc = seed

  val it = xs.iterator

  while (it.hasNext) {
    result = f(result, it.next())
  }

  result
}

def fold2[Acc](xs: List[Int], seed: Acc)(f: (Acc, Int) => Acc): Acc = {
  if(xs.isEmpty) seed
  else fold2(xs.tail, f(seed, xs.head))(f)
}

def sumInts(xs: List[Int]): Int = fold(xs, 0)((x, y) => x + y)

def multiplyInts(xs: List[Int]): Int = fold(xs, 1)((x, y) => x * y)

def stringify(xs: List[Int]): String = fold(xs, "")((x, y) => x + y)

def map2(xs: List[Int], f: Int => Int): List[Int] =
  fold(xs, List.empty[Int])((acc, elm) => f(elm) :: acc).reverse


sumInts(xs)
multiplyInts(xs)
stringify(xs)
map2(xs, x => x * x)

