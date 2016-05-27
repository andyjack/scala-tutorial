class Point(xc: Int, yc: Int) extends Similarity {
  var x: Int = xc
  var y: Int = xc
  def isSimilar(obj: Any) =
    obj.isInstanceOf[Point] &&
    obj.asInstanceOf[Point].x == x
}
object TraitsTest extends App {
  val p1 = new Point(2, 3)
  val p2 = new Point(2, 4)
  val p3 = new Point(3, 3)
  // false, p2 is similar
  println(p1.isNotSimilar(p2))
  // true, p3 is not similar
  println(p1.isNotSimilar(p3))
  // true, 2 is not a Point
  println(p1.isNotSimilar(2))
}
