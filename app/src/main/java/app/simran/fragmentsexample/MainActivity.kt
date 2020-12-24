package app.simran.fragmentsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var btn1: Button = findViewById(R.id.btnFragment)
    var btn2: Button = findViewById(R.id.btnFragment2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener { showFragment1() }
        btn2.setOnClickListener { showFragment2() }
    }

    private fun showFragment1() {

    }

    private fun showFragment2() {

    }
}