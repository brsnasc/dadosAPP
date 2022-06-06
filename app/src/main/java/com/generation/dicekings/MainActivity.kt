package com.generation.dicekings

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.DADO)
        val buttonD12 = findViewById<Button>(R.id.DADO2)
        val buttonD20 = findViewById<Button>(R.id.DADO3)

        buttonD6.setOnClickListener {
            lancarDados(6, 1)
        }

        buttonD12.setOnClickListener {
            lancarDados(12, 2)
        }

        buttonD20.setOnClickListener {
            lancarDados(20, 3)
        }

    }

    private fun lancarDados(faces: Int, lado: Int) {
        val lancamento = (1..faces).random()

        when (lado) {

            1 -> {
                val buttonD6 = findViewById<TextView>(R.id.textView2)
                buttonD6.text = lancamento.toString()
                R.drawable.dice_1
                R.drawable.dice_2
                R.drawable.dice_3
                R.drawable.dice_4
                R.drawable.dice_5
                R.drawable.dice_6
            }

            2 -> {
                val buttonD12 = findViewById<TextView>(R.id.textView2)
                buttonD12.text = lancamento.toString()
                R.drawable.d81
                R.drawable.d82
                R.drawable.d83
                R.drawable.d84
                R.drawable.d85
                R.drawable.d86
                R.drawable.d87
                R.drawable.d88
            }

            3 -> {
                val button20 = findViewById<TextView>(R.id.textView2)
                button20.text = lancamento.toString()
                R.drawable.d20_1
                R.drawable.d20_2
                R.drawable.d20_3
                R.drawable.d20_4
                R.drawable.d20_5
                R.drawable.d20_6
                R.drawable.d20_7
                R.drawable.d20_8
                R.drawable.d20_9
                R.drawable.d20_10
                R.drawable.d20_11
                R.drawable.d20_12
                R.drawable.d20_13
                R.drawable.d20_14
                R.drawable.d20_15
                R.drawable.d20_16
                R.drawable.d20_17
                R.drawable.d20_18
                R.drawable.d20_19
                R.drawable.d20_20
            }

            else -> {}

        }
    }
}