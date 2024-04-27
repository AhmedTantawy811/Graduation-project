package com.example.graduationproject.Ui.registration.forget_password

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.graduationproject.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class EditForgetPasswordActivity : BottomSheetDialogFragment() {
    lateinit var continue_butt2: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_edit_forget_password, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        continue_butt2=view.findViewById(R.id. continue_butt2)
        continue_butt2.setOnClickListener {
            loadFragment(ResetPasswordActivity())
        }
    }
    private fun loadFragment(fragment: Fragment){
        val transaction =childFragmentManager.
        beginTransaction()
        transaction.replace(R.id.childFragmentContainerResetPass, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}