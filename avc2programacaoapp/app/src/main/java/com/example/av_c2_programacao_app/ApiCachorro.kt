package com.example.av_c2_programacao_app

import android.telecom.Call
import retrofit2.Call
import retrofit2.http.*

interface ApiCachorro {

    // Método HTTP "Get" e a URI é "/filmes"
    @GET("cachorro")
    fun get(): Call<List<Cachorro>>
    // O retorno (corpo da resposta) desse EndPoint, em caso de sucesso é uma List de Filme


}