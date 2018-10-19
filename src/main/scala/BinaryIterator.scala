class BinaryIterator (elements: Array[Int]) extends Iterator{
  type T = Int
  var pos = 0
  def hasNext: Boolean = pos < elements.size
  def next: T = {
   elements(0)
  }
} 