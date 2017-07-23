package basket

import item.ShoppingItem.SimpleValuedItem
import saving.collector.SavingCollector

class BasketBuilder(items : List[SimpleValuedItem], collector : SavingCollector) {

  def add(item: SimpleValuedItem) : BasketBuilder = {
    return new BasketBuilder(item :: items, collector)
  }

  def result() : Basket = {
    return new Basket(items, collector)
  }

}
