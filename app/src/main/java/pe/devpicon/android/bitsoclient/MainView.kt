package pe.devpicon.android.bitsoclient

/**
 * Created by armando on 7/9/17.
 */
public interface MainView {
    fun showProgressBar()
    fun hideProgressbar()
    fun showData(tickerList: List<Ticker>)
    fun errorMessage()
}