import example.{Ord, S}

S.sort(List(3, 1, 8, 2, 4))(Ord.intOrd)

S.sort(List("b", "a", "z"))(Ord.strOrd)

S.sort(List(Some(100), None, Some(8)))(Ord.optOrd(Ord.intOrd))
S.sort(List(Some("z"), None, Some("a")))(Ord.optOrd(Ord.strOrd))


S.sort(List(("s", 10), ("s", 2), ("a", 100)))(Ord.pairOrd(Ord.strOrd, Ord.intOrd))
