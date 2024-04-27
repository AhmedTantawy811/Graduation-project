package com.example.graduationproject.Ui.home.fragment.settings.child_setting

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.activity.OnBackPressedCallback
import com.example.graduationproject.R
import com.example.graduationproject.Ui.registration.sing_up.Sing_up


class UserProfileEditFragment : Fragment() {
    lateinit var backButton: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_profail_edit, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backButton = view.findViewById(R.id.back_ic)
        // Set up back button handling
        backButton.setOnClickListener {
          //  listener?.showBottomNavigation()
          activity?.onBackPressed()
           
        }
    }

}