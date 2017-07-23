package basket

class Receipt(subTotal: BigDecimal, total : BigDecimal, description : String) {

  def result: String =
    f"""SUBTOTAL     : £$subTotal%.2f
       |TOTAL        : £$total%.2f
       |
       |SAVINGS $description
     """.stripMargin

}
