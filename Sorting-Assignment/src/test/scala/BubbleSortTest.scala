
import org.scalatest.funsuite.AnyFunSuite

class BubbleSortTest extends AnyFunSuite {
  test("BubbleSort function should sort the list(1,5,3,2) to list(1,2,3,5)"){
    val list1 = List(11,52,33,21)
    assert(BubbleSort().bubbleSort(list1) === List(11,21,33,52))
  }
  test("BubbleSort function should return true here when sorted version of list(34,21,33) is not equal to list(34,21,33)"){
    val list3 = List(34,21,33)
    assert(BubbleSort().bubbleSort(list3) != List(34,21,33))
  }

}
