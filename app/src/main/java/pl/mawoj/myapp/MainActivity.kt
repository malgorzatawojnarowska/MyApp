package pl.mawoj.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val helloTxt = findViewById<TextView>(R.id.textView6)
        btnClickMe.setOnClickListener {
            btnClickMe.text = "You clicked me!"
            helloTxt.text = "Hello you!"
        }
    }
}