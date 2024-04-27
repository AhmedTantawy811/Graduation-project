package com.example.graduationproject.Ui.registration.sing_up

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.graduationproject.R
import com.example.graduationproject.Ui.registration.userProfail.UserProfaile

class Sing_up : AppCompatActivity() {

   lateinit var singUpButton: Button
    lateinit var singInButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)
        singUpButton=findViewById(R.id.singUp_butt)
        singInButton=findViewById(R.id.I_have_account_butt)

        singUpButton.setOnClickListener {
            SingInScreenIntent()
        }
        singInButton.setOnClickListener {
            SingInScreenIntent()
        }
    }

    private fun SingInScreenIntent() {
        val SingInIntent= Intent(this, UserProfaile::class.java)
        startActivity(SingInIntent)
        finish()

    }
}