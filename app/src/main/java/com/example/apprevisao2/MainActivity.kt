package com.example.apprevisao2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Nome : EditText = findViewById(R.id.edtNome)
        val Enderecp : EditText = findViewById(R.id.edtEndereco)
        val Cep : EditText = findViewById(R.id.edtCep)
        val Bairro : EditText = findViewById(R.id.edtBairro)
        val Cidade : EditText = findViewById(R.id.edtCidade)
        val btnCadastrar : Button = findViewById(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener {
            Toast.makeText(this,"Nome: "+Nome.text.toString(),Toast.LENGTH_LONG).show()
        }
    }
}