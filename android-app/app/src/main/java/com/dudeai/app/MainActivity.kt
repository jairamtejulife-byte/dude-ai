package com.dudeai.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24, 32, 24, 24)
            setBackgroundColor(Color.rgb(12, 20, 35))
        }

        val title = TextView(this).apply {
            text = "DUDE AI"
            textSize = 30f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Your personal AI assistant"
            textSize = 16f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        val status = TextView(this).apply {
            text = "Offline AI model setup is pending."
            textSize = 16f
            setTextColor(Color.rgb(80, 220, 190))
            setPadding(0, 40, 0, 20)
        }

        val info = TextView(this).apply {
            text = "Welcome! Your DUDE AI app is being prepared. The real AI engine will be connected after the setup."
            textSize = 17f
            setTextColor(Color.WHITE)
            setPadding(0, 20, 0, 20)
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(status)
        layout.addView(info)

        setContentView(layout)
    }
}
