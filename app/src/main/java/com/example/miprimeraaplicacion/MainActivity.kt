package com.example.miprimeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun imprimirNombre(view: android.view.View) {
        var cajaNombre : EditText = findViewById(R.id.txtNombre)
        var mostrar : TextView = findViewById(R.id.txtSalida)
        var nombreUsuario : String = null.toString()

        nombreUsuario = cajaNombre.getText().toString()
        mostrar.setText(nombreUsuario)

        //Toast.makeText(this,"si sirve",Toast.LENGTH_LONG).show()
    }


}