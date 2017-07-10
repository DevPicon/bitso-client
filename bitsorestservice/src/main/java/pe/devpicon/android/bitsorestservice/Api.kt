package pe.devpicon.android.bitsorestservice

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by armando on 7/8/17.
 */
class Api {

    fun init() {
        bitsoService = getClient()?.create(BitsoService::class.java) as BitsoService
    }

    companion object {
        var retrofit: Retrofit? = null
        lateinit var bitsoService : BitsoService
    }

    fun getClient(): Retrofit? {
        if(retrofit == null){
            retrofit = Retrofit.Builder()
                    .baseUrl("https://api.bitso.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(getLogginInterceptor())
                    .build()
        }
        return retrofit
    }

    fun getLogginInterceptor(): OkHttpClient? {
        val logginInterceptor = HttpLoggingInterceptor()
        logginInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val builder = OkHttpClient.Builder()
        builder.interceptors().add(logginInterceptor)
        return builder.build()
    }
}