package deal

import item.ShoppingItem.SimpleValuedItem
import extensions.Extensions._
import saving.{Saving, Savings}

class SimpleDeal(saving: Saving, toCollect: List[SimpleValuedItem]) {

  var currentSaving : Option[Saving] = Option.empty

  var leftToCollect : List[SimpleValuedItem] = toCollect

  def supply(item : SimpleValuedItem): Unit ={
    leftToCollect = leftToCollect.removeFirst(_.equalType(item))
    if (leftToCollect.size == 0) appendActual() else appendEmpty()
  }

  def collectSavings() : Saving = currentSaving.getOrElse(Savings.none())

  private def appendEmpty(): Unit ={
    currentSaving = currentSaving.orElse(Option.empty)
  }

  private def appendActual(): Unit ={
    currentSaving = currentSaving.orElse(Option(saving))
  }


}
