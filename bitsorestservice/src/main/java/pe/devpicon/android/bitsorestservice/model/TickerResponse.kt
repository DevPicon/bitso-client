package pe.devpicon.android.bitsorestservice.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by armando on 7/9/17.
 */
data class TickerResponse(
        @field:SerializedName("payload")
        @field:Expose
        val payload: List<PayloadItem>? = null,

        @field:SerializedName("success")
        @field:Expose
        var success: Boolean = false
) {
    data class PayloadItem(
            @field:SerializedName("book")
            @field:Expose
            val book: String,

            @field:SerializedName("volume")
            @field:Expose
            val volume: String,

            @field:SerializedName("high")
            @field:Expose
            val priceHigh: String,

            @field:SerializedName("last")
            @field:Expose
            val lastTradedPrice: String,

            @field:SerializedName("low")
            @field:Expose
            val priceLow: String,

            @field:SerializedName("vwap")
            @field:Expose
            val volumeWeightedAveragePrice: String,

            @field:SerializedName("ask")
            @field:Expose
            val lowestSellOrder: String,

            @field:SerializedName("bid")
            @field:Expose
            val highestBuyOrder: String,

            @field:SerializedName("created_at")
            @field:Expose
            val createdAt: String
    )
}


