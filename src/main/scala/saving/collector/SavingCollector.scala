package saving.collector

import item.ShoppingItem.SimpleValuedItem
import saving.Saving

trait SavingCollector {

  def collect(items: Seq[SimpleValuedItem]) : Seq[Saving]

}
