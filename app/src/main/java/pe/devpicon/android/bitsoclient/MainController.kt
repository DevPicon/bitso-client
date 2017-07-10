package pe.devpicon.android.bitsoclient

import pe.devpicon.android.bitsorestservice.Api
import pe.devpicon.android.bitsorestservice.Service
import pe.devpicon.android.bitsorestservice.model.TickerResponse

/**
 * Created by armando on 7/9/17.
 */
class MainController(val view: MainView) {
    fun loadData() {
        view.showProgressBar()
        val service = Service()
        val api = Api()
        api.init()
        service.getTickers { response: TickerResponse ->
            run {
                view.hideProgressbar()

                if (response.success){
                    val tickerList = response.payload?.map {
                        it ->
                        Ticker(
                                book = it.book,
                                priceLow = it.priceLow,
                                priceHigh = it.priceHigh
                        )
                    }
                    tickerList?.let { view.showData(it) };
                }
                else {
                    view.errorMessage()
                }

            }
        }

    }


}