
val email = "mushtaq@thoughtworks.com"

object Email {
  def unapply(arg: String): Option[(String, String)] = arg.split("@") match {
    case Array(user, name) => Some((user, name))
    case _                 => None
  }
}

def parse(email: String): String = email match {
  case Email(user, domain) => s"Hello $user from $domain"
  case _                   => "error"
}

parse(email)
parse("aaa")
parse("aaa@asdasd@asdas")
