import data.Book
import data.Data.books
import play.api.libs.json.Json

val xs = List(1, 4, 2, 8, 3)

xs.sorted

xs.max




val json = Json.toJson(books.head)

json.as[Book]

xs.map(x => x + 1)