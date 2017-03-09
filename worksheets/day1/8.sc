
import data.Data._

books.foreach(println)

books.find(_.author == "odersky1")
books.forall(_.author == "odersky")

books.filter(_.author == "odersky").foreach(println)

books.map(_.basePrice)

books.filter(_.author == "odersky").map(_.basePrice)

books
  .groupBy(_.author)
  .map(t => (t._1, t._2.map(_.basePrice).sum))

books
  .groupBy(_.author)
  .mapValues(_.map(_.basePrice).sum)

books.sortBy(-_.basePrice)
books.sortBy(b => (-b.basePrice, b.author))
