package com.example.graduationproject.Ui.registration.sing_in

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.example.graduationproject.Ui.home.MainActivity
import com.example.graduationproject.R
import com.example.graduationproject.Ui.home.fragment.settings.child_setting.LogoutFragment
import com.example.graduationproject.Ui.registration.forget_password.ForgetPasswordActivity
import com.example.graduationproject.Ui.registration.sing_up.Sing_up
import com.google.android.material.bottomsheet.BottomSheetDialog

class Sing_in : AppCompatActivity() {


    lateinit var singUpButton: Button
    lateinit var singInButton: Button
    lateinit var forgetPasswordButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)
        forgetPasswordButton = findViewById(R.id.forgetPassword_butt)
        singInButton = findViewById(R.id.singIn_butt)
        singUpButton = findViewById(R.id.I_have_account_butt)

        singInButton.setOnClickListener {
            homeScreenIntent()
        }
        singUpButton.setOnClickListener {
            SingInScreenIntent()
        }
        // Show bottom sheet dialog on button click
          forgetPasswordButton.setOnClickListener {
          val bottomSheetFragment = ForgetPasswordActivity()
            bottomSheetFragment.show(supportFragmentManager, "BottomSheetFragment")
        }
    }


    private fun homeScreenIntent() {
        val homeIntent= Intent(this, MainActivity::class.java)
        startActivity(homeIntent)
        finish()

    }
    private fun SingInScreenIntent() {
        val SingInIntent= Intent(this, Sing_up::class.java)
        startActivity(SingInIntent)
        finish()

    }
}