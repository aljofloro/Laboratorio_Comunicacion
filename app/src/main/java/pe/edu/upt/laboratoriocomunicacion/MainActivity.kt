package pe.edu.upt.laboratoriocomunicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

const val MESSAGE:String = "MENSAJE01"

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<Button>(R.id.button).setOnClickListener {
        val intent = Intent(this
          ,Saludar::class.java)
        val editText
        = findViewById<EditText>(R.id.editText)
        intent.putExtra(MESSAGE,editText.text)
        startActivity(intent)
      }
  }
}