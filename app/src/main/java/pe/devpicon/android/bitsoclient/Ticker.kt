package pe.devpicon.android.bitsoclient

/**
 * Created by armando on 7/9/17.
 */
data class Ticker(val book : String = "",
                  val volume : String = "",
                  val priceHigh : String = "",
                  val lastTradedPrice : String = "",
                  val priceLow : String = "",
                  val volumeWeightedAveragePrice : String = "",
                  val lowestSellOrder : String = "",
                  val highestBuyOrder : String = "",
                  val createdAt : String = "")