package com.example.praporlesson

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.floor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userEnterName = findViewById<EditText>(R.id.edt_name).toString()
        val userEnterPrice = findViewById<EditText>(R.id.edt_price).toString()
        val button: Button = findViewById<Button>(R.id.btn_calculate)
        findViewById<Button>(R.id.btn_calculate)?.setOnClickListener {
            button.setOnClickListener {
                val action = listOf("Бананы", "Яблоки", "Шоколад")
                val discount = 0.05
                val cashRate = 1.5
                val sumRate = 100
                val formaterDeci = "%.2f"
                val formaterInt = "%.0f"
                val finalPrint =
                    when {
                        (userEnterName in action) -> {
                            (userEnterPrice.toDouble() * discount)
                        }

                        else -> {
                            ((floor(userEnterPrice.toDouble() / sumRate)) * cashRate)
                        }
                    }
                val forFormater =
                    if (finalPrint % 1.0 == 0.toDouble()) {
                        formaterInt
                    } else formaterDeci
//                val txtResult: Any =
                forFormater.format(finalPrint)
//                findViewById<EditText>(R.id.txt_result)
            }
        }
    }
}