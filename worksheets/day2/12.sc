case class Address(pin: Int)
case class Person(name: String, age: Int, address: Address) {
  def isAdult: Boolean = age > 18
}

val p = new Person("abc", 33, new Address(123))
val p2 = new Person("abc", 33, new Address(123))

p.isAdult

p eq p2

p == p2

p.hashCode()
p2.hashCode()

p.name
p.age
p.copy().hashCode()
p.copy(age = 29).hashCode()
p.copy(age = 29, name = "ttr")

p == p2
