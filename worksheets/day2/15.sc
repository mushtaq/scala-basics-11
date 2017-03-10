
class Person(val name: String, val age: Int)

object Person {
  def apply(name: String, age: Int): Person = new Person(name, age)
  def unapply(p: Person): Option[(String, Int)] = Some((p.name, p.age))
}


val x: AnyRef = "abc"

val p = Person("abc", 33)

val Person(asdasd, ag) = p

x match {
  case Person(n, a) => s"Hello $n of age $a"
  case "abc" => "empty"
  case _ => "error"
}
