package com.example.av_c2_programacao_app

object ConexaoApiCachorro {
    fun criar(): ApiCachorro {

        // recuperamos, por meio do Retrofit, a implementação da interface com os EndPoints
        return Retrofit.Builder()
            .baseUrl("https://5f861cfdc8a16a0016e6aacd.mockapi.io/bandtec-api/cachorros") // URL Base da API
            .addConverterFactory(GsonConverterFactory.create()) // quem será o "conversor" JSON <=> Classe
            .build()
            .create(ApiCachorro::class.java)
    }
}
