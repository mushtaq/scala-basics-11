def flag: Boolean = ???

trait Base
class D1 extends Base
class D2 extends Base

def x: Base = if(flag) new D1 else new D2
def x2: AnyRef = if(flag) new D1 else "abc"

def x3 = if(flag) false else 10
def x4 = if(flag) new D1 else 10

null
def y = throw new RuntimeException
()

def x5 = if(flag) new D1 else null
def x6 = if(flag) new D2 else null
def x7 = if(flag) "abc" else null

def x8 = if(flag) 10 else null
def x9 = if(flag) new D1 else throw new RuntimeException
def x10 = if(flag) "abc" else throw new RuntimeException
def x11 = if(flag) 10 else throw new RuntimeException

def x12 = if(flag) 10 else ()
def x13 = if(flag) "aaa"

(1: Any).asInstanceOf[Int]
(1: Unit).asInstanceOf[Int]

val dd: Unit = {
  1
  2
  "asdasd"
  4
}