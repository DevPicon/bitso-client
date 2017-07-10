package pe.devpicon.android.bitsoclient

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by armando on 7/9/17.
 */
class TickerAdapter(var tickerList: MutableList<Ticker> = mutableListOf())
    : RecyclerView.Adapter<TickerViewHolder>() {
    override fun onBindViewHolder(holder: TickerViewHolder?, position: Int) {
        holder?.bind(tickerList[position])
    }

    override fun getItemCount(): Int = tickerList.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TickerViewHolder {
        val itemView = LayoutInflater.from(parent?.context).inflate(R.layout.item_ticker, parent, false)
        return TickerViewHolder(itemView)
    }

}

class TickerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val txtBookName = itemView.findViewById(R.id.txt_book_name) as TextView
    val txtLowestPrice = itemView.findViewById(R.id.txt_lowest_price) as TextView
    val txtHighestPrice = itemView.findViewById(R.id.txt_highest_price) as TextView

    fun bind(ticker: Ticker) {

        txtBookName.text = ticker.book
        txtHighestPrice.text = ticker.priceHigh
        txtLowestPrice.text = ticker.priceLow

    }
}