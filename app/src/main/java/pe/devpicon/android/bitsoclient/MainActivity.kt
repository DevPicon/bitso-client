package pe.devpicon.android.bitsoclient

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View

class MainActivity : AppCompatActivity(), MainView {

    lateinit var controller : MainController
    lateinit var tickerAdapter : TickerAdapter

    override fun showProgressBar() {
        findViewById(R.id.my_progress_bar).visibility = View.VISIBLE;
    }

    override fun hideProgressbar() {
        findViewById(R.id.my_progress_bar).visibility = View.GONE;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvTicker = findViewById(R.id.my_recyclerview) as RecyclerView
        rvTicker.layoutManager = LinearLayoutManager(this)
        tickerAdapter = TickerAdapter()
        rvTicker.adapter = tickerAdapter

        controller = MainController(this)
        controller.loadData()

    }

    override fun showData(tickerList: List<Ticker>) {
        val toMutableList = tickerList.toMutableList()
        tickerAdapter.tickerList = toMutableList
        tickerAdapter.notifyDataSetChanged()
    }


    override fun errorMessage() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
