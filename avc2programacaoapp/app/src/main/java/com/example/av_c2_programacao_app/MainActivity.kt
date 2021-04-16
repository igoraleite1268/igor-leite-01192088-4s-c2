package com.example.av_c2_programacao_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    //ir para segunda tela para cadastrar os cachorros
    fun CadastrarCachorros(view: View) {
    val CadastarC = Intent(this, CadastarC::class.java)

    startActivity(CadastarC)
        }

    //ir para terceira tela para listar os cachorros
    fun ListarCachorros(view: View) {
        val MostrarC = Intent(this, MostrarC::class.java)

        startActivity(MostrarC)
    }


}