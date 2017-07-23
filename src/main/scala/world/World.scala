package world

import basket.BasketBuilder
import deal.SimpleDeal
import saving.collector.{SavingCollector, SimpleSavingCollector}

class World(deals : Seq[SimpleDeal]) {


  def buildBasket() : BasketBuilder = new BasketBuilder(List.empty, collector())

  private def collector() : SavingCollector = new SimpleSavingCollector(deals)

}
