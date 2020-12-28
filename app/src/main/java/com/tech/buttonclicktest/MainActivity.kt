package com.tech.buttonclicktest

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var btn2: Button? = null
    var button3: Button? = null
    var button4: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)//is calling parent class onCreate method
        setContentView(R.layout.activity_main)//we are inflating are view from xml to kotlin

        init()//method calling


        btn2?.setOnClickListener { //this block will executed when the second buttton will be clicked
            Toast.makeText(this, "button 22222", Toast.LENGTH_SHORT).show()
        }
        button3?.setOnClickListener(this)
        button4?.setOnClickListener(this)

    }

    private fun init() {
        btn2 = findViewById(R.id.btn2)//button inititalization
        button3 = findViewById(R.id.btn3)
        button4 = findViewById(R.id.btn4)

    }

    fun click(view: View) {//this function will be executed after click on button

        Toast.makeText(this, "this is button 1", Toast.LENGTH_SHORT).show()

    }

    override fun onClick(v: View?) {
      when(v?.id)
      {
          R.id.btn3-> Toast.makeText(this, "button 333333333333", Toast.LENGTH_SHORT).show()
          R.id.btn4-> Toast.makeText(this, "button 44444444444", Toast.LENGTH_SHORT).show()

      }

    }


}
