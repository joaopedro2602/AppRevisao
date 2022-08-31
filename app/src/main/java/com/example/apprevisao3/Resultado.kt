package com.example.apprevisao3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.apprevisao2.db.DBHelper

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val edtNome : EditText = findViewById(R.id.edtNome)
        val edtEndereco : EditText = findViewById(R.id.edtEndereco)
        val edtBairro : EditText = findViewById(R.id.edtBairro)
        val edtCep : EditText = findViewById(R.id.edtCep)

        val btnConfirmar : Button = findViewById(R.id.btnConfirmar)

        edtNome.setText(intent.getStringExtra("nome"))
        edtEndereco.setText(intent.getStringExtra("endereco"))
        edtCep.setText(intent.getStringExtra("cep"))
        edtBairro.setText(intent.getStringExtra("bairro"))


        val db = DBHelper(this, null)

        btnConfirmar.setOnClickListener{
            db.addPessoas(edtNome.text.toString(), edtEndereco.text.toString(),
                edtCep.text.toString(), edtBairro.text.toString())
            finish()
        }


    }
}