package app.simran.fragmentsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btn1: Button
    lateinit var btn2: Button

    val firstFragment = FirstFragment()
    val secondFragment = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btnFragment)
        btn2 = findViewById(R.id.btnFragment2)

        btn1.setOnClickListener { showFragment1() }
        btn2.setOnClickListener { showFragment2() }

        showFragment1()
    }

    private fun showFragment1() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment, firstFragment)
            addToBackStack(null)
            commit()
        }
    }

    private fun showFragment2() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment, secondFragment)
            addToBackStack(null)
            commit()
        }
    }
}