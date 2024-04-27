package com.example.graduationproject.Ui.registration.forget_password

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.graduationproject.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ResetPasswordActivity : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)
    : View? {

        return inflater.inflate(R.layout.activity_reset_password, container, false)
    }
}