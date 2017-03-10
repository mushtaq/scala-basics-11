class A extends AnyRef {
  def isWise = true
}

object A extends AnyRef {
  def isWise = true
  val Constant = 3.14
}


new A().isWise
A.isWise
A.Constant

