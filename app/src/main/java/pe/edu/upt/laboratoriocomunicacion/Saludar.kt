package pe.edu.upt.laboratoriocomunicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView

class Saludar : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_saludar)

    val intent:Intent = getIntent()
    val saludo:String = "HOLA " +
        (intent.extras?.get(MESSAGE))?:""
    //creo dinámicamente una etiqueta
    val texto = TextView(this)
    texto.text = saludo
    texto.textSize = 25f
    //Referenciando mi Layout
    val viewGroup:ViewGroup =
      findViewById(R.id.mostrar_saludo)
    //Agrego y muestro mi etiqueta en el layout
    viewGroup.addView(texto)
  }

}