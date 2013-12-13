abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  override def toString(): String
}

class NonEmptyIntSet(elem: Int, xs: IntSet = new EmptyIntSet) extends IntSet{
  def incl(x: Int) = this
  def contains(x: Int) = { if (x == elem) true else xs contains elem }
  override def toString() = elem.toString
}




class EmptyIntSet extends IntSet{
  def incl(x: Int) = new NonEmptyIntSet(x, this)
  def contains(x: Int) = false
  override def toString() = "Empty"
}


val s1 = new EmptyIntSet


println(s1.toString())


val s1a = s1.incl(5)


println(s1a.toString())



var s2 = new NonEmptyIntSet(5)


println(s2.toString())


val s2a = s2.incl(3)


println(s2a.toString())





/*Purely Functional Sets.*/
/*
abstract class FunSets {
  type Set = Int => Boolean
  def contains(s: Set, elem: Int) = s(elem)
  def singletonSet(elem: Int): Set = this
  def union(s: Set, t: Set): Set = ???
  def intersect(s: Set, t: Set): Set = ???
  def diff(s: Set, t: Set): Set = ???
  //def toString
  //def printSet
}




class EmptySet extends FunSets{
}


class NonEmptySet extends FunSets{
}


NonEmptySet.singletonSet(5)

*/




















