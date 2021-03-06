// Exercise 5
trait Contact {
  val email:String
}

class Person(val first:String, val last:String) {
  override def toString = s"$first $last"
}

class Friend(first:String, last:String, val email:String)
  extends Person(first:String, last:String) with Contact

val friends = Vector(
  new Friend("Zach", "Smith", "zach@smith.com"),
  new Friend("Mary", "Add", "mary@add.com"),
  new Friend("Sally","Taylor","sally@taylor.com"),
  new Friend("Mary", "Smith", "mary@smith.com")
)

val s1 = friends.sortBy(_.first)
val s2 = s1.sortBy(_.last)
