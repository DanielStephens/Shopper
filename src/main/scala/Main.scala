import basket.{Basket, Receipt}
import deal.{Deal, SimpleDeal}
import item.ShoppingItem.{Apple, Bread, Milk}
import saving.Savings
import world.World

object Main extends App{


  override def main(args: Array[String]): Unit = {

    val appleDiscount : SimpleDeal = Deal .on(List(new Milk))
                                          .thatSaves(Savings.of("0.1", "Save 10% on milk"))
                                          .build()
    val breadDiscount : SimpleDeal = Deal .on(List(new Apple, new Bread))
                                          .thatSaves(Savings.of("0.25", "Half price bread when you buy apples as well"))
                                          .build()

    val world : World = new World(Seq(appleDiscount, breadDiscount))

    val basket : Basket = world.buildBasket() .add(new Apple)
                                              .add(new Bread)
                                              .add(new Milk)
                                              .result()

    val receipt : Receipt = basket.checkout()
    println(receipt.result)
  }

}
