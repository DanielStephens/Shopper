package saving

object Savings {

  def of(value : BigDecimal, cause : String) : Saving = (in: BigDecimal, description : StringBuilder) => {
    val savedString =
      f"""
         |Saved £$value%.2f """.stripMargin

    description.append(f"$savedString%-15s")
    description.append(s"'$cause'")
    value
  }

  def of(value : String, cause : String) : Saving = {
    of(BigDecimal(value), cause)
  }

  def none() : Saving = (in: BigDecimal, description : StringBuilder) => {
    BigDecimal(0)
  }

}
