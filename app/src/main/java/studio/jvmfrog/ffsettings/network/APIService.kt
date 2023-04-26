package studio.jvmfrog.ffsettings.network

import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET()
    fun getManufacturersList(): Call<MutableList<Model>>
}