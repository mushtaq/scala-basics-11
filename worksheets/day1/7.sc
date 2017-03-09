import scala.annotation.tailrec

def map2(xs: List[Int], f: Int => Int): List[Int] = {
  if(xs.isEmpty) List.empty else f(xs.head) :: map2(xs.tail, f)
}

map2((1 to 10).toList, x => x + 1)

//map2((1 to 10000).toList, x => x + 1)


def map3(xs: List[Int], f: Int => Int): List[Int] = {

  @tailrec
  def map3helper(xs: List[Int], stack: List[Int]): List[Int] = {
    if(xs.isEmpty) stack
    else map3helper(xs.tail, f(xs.head) :: stack)
  }

  map3helper(xs, List.empty).reverse
}

map3((1 to 10000).toList, x => x + 1)
