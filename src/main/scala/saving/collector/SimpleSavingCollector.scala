package saving.collector

import deal.SimpleDeal
import item.ShoppingItem.SimpleValuedItem
import saving.Saving

class SimpleSavingCollector(deals: Seq[SimpleDeal]) extends SavingCollector{

  def collect(items: Seq[SimpleValuedItem]) : Seq[Saving] = {
    deals.foreach(d => items.foreach(i => d.supply(i)))
    deals.map(_.collectSavings())
  }

}
