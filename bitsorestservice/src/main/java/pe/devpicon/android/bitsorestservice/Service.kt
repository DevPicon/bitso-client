package pe.devpicon.android.bitsorestservice

import pe.devpicon.android.bitsorestservice.model.TickerResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by armando on 7/9/17.
 */
class Service {

    fun getTickers(success: (response: TickerResponse) -> Unit) {
        val bitsoService = Api.bitsoService
        val call : Call<TickerResponse> = bitsoService.getTickers()
        var x:Response<TickerResponse>? = null
        call.enqueue(object : Callback<TickerResponse> {
            override fun onResponse(call: Call<TickerResponse>?, response: Response<TickerResponse>?) {
                if(response?.code() == 200){

                    response.body()?.let { success(it) }

                } else {
                    println("${response?.code()}")
                }
            }

            override fun onFailure(call: Call<TickerResponse>?, t: Throwable?) {
                println("not implemented") //To change body of created functions use File |
                // Settings | File Templates.
            }

        })
        println("Esto llegó: ${x}")
    }

}