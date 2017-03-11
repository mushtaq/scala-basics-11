import example.{Ord, S}


S.sort(List(3, 1, 8, 2, 4))

S.sort(List("b", "a", "z"))

S.sort(List(Some(100), None, Some(8)))
S.sort(List(Some("z"), None, Some("a")))

{
  implicit val intOrd2: Ord[Int] = (a: Int, b: Int) => a >= b
  S.sort(List(("s", 10), ("s", 2), ("a", 100)))
}

S.sort(List((Some("s"), Some(10)), (Some("s"), None), (None, Some(100))))

S.sort(data.Data.books.map(Option.apply)).foreach(println)
