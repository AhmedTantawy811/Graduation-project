package com.example.graduationproject.Ui.registration.forget_password

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.graduationproject.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ForgetPasswordActivity() : BottomSheetDialogFragment() {
lateinit var continue_butt:Button
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_forget_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        continue_butt=view.findViewById(R.id. continue_butt)
        continue_butt.setOnClickListener {
            loadFragment(EditForgetPasswordActivity())
        }
    }
    private fun loadFragment(fragment: Fragment){
        val transaction =childFragmentManager.
        beginTransaction()
        transaction.replace(R.id.childFragmentContainerForget, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}