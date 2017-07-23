package deal

import builder.{Builder, _}
import item.ShoppingItem.SimpleValuedItem
import saving.{Saving, Savings}

object Deal {

  def on(items : List[SimpleValuedItem]) : DealSavingBuilder = (saving: Saving) => builder(items, saving)

  private def builder(items : List[SimpleValuedItem], saving : Saving) : Builder[SimpleDeal] = () => new SimpleDeal(saving, items)

}
