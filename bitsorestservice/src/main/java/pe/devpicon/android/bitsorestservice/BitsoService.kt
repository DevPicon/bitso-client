package pe.devpicon.android.bitsorestservice

import pe.devpicon.android.bitsorestservice.model.TickerResponse
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by armando on 7/8/17.
 */
interface BitsoService {

    @GET("v3/ticker/")
    fun getTickers(): Call<TickerResponse>
}

