package com.example.demonave

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /* Solucion de Erick
    fun click1(view: View) {
        Navigation.findNavController(view)
            .navigate(R.id.action_inicioFragmento_to_primerFragmento2)
    }
     fun click2(view: View) {
         Navigation.findNavController(view)
             .navigate(R.id.action_inicioFragmento_to_segundoFragmento)
     }
*/

}