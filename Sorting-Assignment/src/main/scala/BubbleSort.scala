

case class BubbleSort() {
  def getLargest(data: List[Int]): (Int, List[Int]) =
    data match {
      case firstElement :: Nil => (firstElement, Nil)
      case firstElement :: remainingList =>
        val (large, remaining) = getLargest(remainingList)
        if (large > firstElement)
          (large, firstElement :: remaining)
        else
          (firstElement, large :: remaining)
    }

  def bubbleSort(data: List[Int]): List[Int] =
    data match {
      case Nil => Nil
      case _ =>
        val (greatest, remainingList) = getLargest(data)
        bubbleSort(remainingList) ::: List(greatest)
    }
}



