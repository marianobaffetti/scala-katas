class BinaryIterator (elements: Array[Int]) extends Iterator{
  type T = Int
  var firstPos = 0
  var lastPos = elements.size
  def hasNext: Boolean = true
  def next: T = {
    var currentPos = lastPos / 2;
    if (elements.size % 2 == 0) currentPos = currentPos - 1
    elements(currentPos)
  }
} 