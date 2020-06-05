package com.example.medicalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), OnClickListener {
    override fun onClick(p0: View?) {
    }

    lateinit var  etEmail:EditText
    lateinit var  etPassword:EditText
    lateinit var  btnLogIN:Button
    lateinit var  btnSignUp:Button
    lateinit var  txtForgetPassword:TextView
    var Email="ankitbajaj@gmail.com"
    var Password ="123456789"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Medical Store"

        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnLogIN=findViewById(R.id.btnLogIn)
        btnSignUp=findViewById(R.id.btnSignUp)
        txtForgetPassword=findViewById(R.id.txtForgetPassword)

        btnLogIN.setOnClickListener {

            var enterEmail=etEmail.text.toString()
            var enterPassword=etPassword.text.toString()

            if (enterEmail==Email && enterPassword==Password)
            {
                val intent= Intent(this@MainActivity,medical_store::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Credential Incorrect !", Toast.LENGTH_SHORT).show()
            }
        }



    }
}
