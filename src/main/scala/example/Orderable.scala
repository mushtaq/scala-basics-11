package example

trait Orderable[T] {
  def <=(x: T): Boolean
}
