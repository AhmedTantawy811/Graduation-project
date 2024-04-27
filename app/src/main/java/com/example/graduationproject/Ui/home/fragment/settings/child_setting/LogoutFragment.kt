package com.example.graduationproject.Ui.home.fragment.settings.child_setting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.graduationproject.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class LogoutFragment : BottomSheetDialogFragment() {

lateinit var logout_butt:Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_logout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        logout_butt=view.findViewById(R.id.logout_butt)
        logout_butt.setOnClickListener {
            System.exit(0)

        }
    }


}