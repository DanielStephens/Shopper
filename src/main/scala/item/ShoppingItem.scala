package item

import scala.math.BigDecimal

object ShoppingItem {

  sealed abstract class SimpleValuedItem(name : String, val value : BigDecimal){

    def equalType(other : SimpleValuedItem) : Boolean = this.getClass.equals(other.getClass)

  }

  sealed case class Apple() extends SimpleValuedItem("Apple", BigDecimal("0.85"))

  sealed case class Milk() extends SimpleValuedItem("Milk", BigDecimal("1.00"))

  sealed case class Bread() extends SimpleValuedItem("Bread", BigDecimal("0.50"))

}
