class BinaryIteratorTest extends org.scalatest.FunSuite {
  test("BinaryIterator.nextGetFirstWhenElementsSizeIsOne_1") {
    val elements = Array(3)
    val iterator = new BinaryIterator(elements)
     assert(iterator.next === elements(0))
  }

  test("BinaryIterator.nextGetFirstWhenElementsSizeIsOne_2") {
    val elements = Array(1)
    val iterator = new BinaryIterator(elements)
     assert(iterator.next === elements(0))
  }

  test("BinaryIterator.nextGetFirstWhenElementsSizeIsTwo") {
    val elements = Array(1,2)
    val iterator = new BinaryIterator(elements)
     assert(iterator.next === elements(0))
  }

  test("BinaryIterator.nextGetFirstWhenElementsSizeIsTwo_2") {
    val elements = Array(2,5)
    val iterator = new BinaryIterator(elements)
     assert(iterator.next === elements(0))
  }

  test("BinaryIterator.nextGetSecondWhenElementsSizeIsThree") {
    val elements = Array(2,5,6)
    val iterator = new BinaryIterator(elements)
     assert(iterator.next === elements(1))
  }

  test("BinaryIterator.nextGetSecondWhenElementsSizeIsFour") {
    val elements = Array(2,5,6,7)
    val iterator = new BinaryIterator(elements)
     assert(iterator.next === elements(1))
  }
}