package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editText)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val radioBtn1 = findViewById<RadioButton>(R.id.r1)
        val radioBtn2 = findViewById<RadioButton>(R.id.r2)
        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        var i="OFF"
        var j="OFF"
        var m=""
        checkBox?.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) i="ON" else i="OFF"
        }
        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) j="ON" else j="OFF"
        }
        radioBtn1.setOnClickListener(View.OnClickListener {
            m = "\nRadioGroup: RadioButton 1"
        })

        radioBtn2.setOnClickListener(View.OnClickListener {
            m = "\nRadioGroup: RadioButton 2"
        })
        button.setOnClickListener({
            textView.setText("EditText:"+editText.getText().toString()+"\nCheckBox: "+i+"\nToggleButton: "+j+m)
        })
    }
}