package problem_one.BestRate

class BestRate {
//  def getBestGroupPrices(rates: Seq[Rate],
//                         prices: Seq[CabinPrice]): Seq[BestGroupPrice] = ???
  case class Rate(rateCode: String, rateGroup: String)
  case class CabinPrice(cabinCode: String,
                        rateCode: String,
                        price: BigDecimal)
  case class BestGroupPrice(cabinCode: String,
                            rateCode: String,
                            price: BigDecimal,
                            rateGroup: String)
}
