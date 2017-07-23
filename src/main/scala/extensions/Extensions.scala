package extensions


import scala.collection.Seq

object Extensions {

  class RichList[A](value : List[A]) {
    def removeFirst(pred: (A) => Boolean): List[A] = {
      val (before, atAndAfter) = value span (x => !pred(x))
      before ::: atAndAfter.drop(1)
    }


  }

  implicit def richSeq[A](value : List[A]) = new RichList(value)
}
