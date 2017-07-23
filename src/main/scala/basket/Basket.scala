package basket

import item.ShoppingItem.SimpleValuedItem
import saving.collector.SavingCollector

class Basket(items : Seq[SimpleValuedItem], collector : SavingCollector) {

  private def calculateSubTotal : BigDecimal = items.map(_.value).sum

  private def calculateTotal(subTotal : BigDecimal, collector : SavingCollector, stringBuilder: StringBuilder) : BigDecimal = {
    collector.collect(items).foldLeft(subTotal)((a, b) => a - b.calculateSaving(subTotal, stringBuilder))
  }

  def checkout() : Receipt = {
    val subTotal : BigDecimal = calculateSubTotal
    val sb : StringBuilder = new StringBuilder
    val total : BigDecimal = calculateTotal(subTotal, collector, sb)

    new Receipt(subTotal, total, sb.result())
  }



}
