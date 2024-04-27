package com.example.graduationproject.Ui.home.fragment.settings

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.example.graduationproject.R
import com.example.graduationproject.Ui.home.BottomNavigationVisibilityListener
import com.example.graduationproject.Ui.home.fragment.alarm.AddAlarmFragment
import com.example.graduationproject.Ui.home.fragment.settings.child_setting.LogoutFragment
import com.example.graduationproject.Ui.home.fragment.settings.child_setting.PasswordManagerFragment
import com.example.graduationproject.Ui.home.fragment.settings.child_setting.UserProfileEditFragment


class SettingsFragment : Fragment() {
    lateinit var cardProfile:CardView
    lateinit var cardLogout:CardView
    lateinit var cardPasswrodManager:CardView



    // Show and Hide bottom navigation
    private var listener: BottomNavigationVisibilityListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is BottomNavigationVisibilityListener) {
            listener = context
        }
    }
    override fun onDetach() {
        super.onDetach()
        listener = null
    }
    override fun onDestroyView() {
        super.onDestroyView()
        // Show bottom navigation when this fragment is destroyed
        listener?.showBottomNavigation()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_settings, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

               //Logout Scerean
        cardLogout=view.findViewById(R.id.cardLogout)
        cardLogout.setOnClickListener {
            val modalBottomSheet = LogoutFragment()
           modalBottomSheet.show(parentFragmentManager, "BottomSheetFragment")
        }

        //Profile Edit Screen
        cardProfile=view.findViewById(R.id.cardProfile)
        cardProfile.setOnClickListener {
            // Hide bottom navigation when this fragment is visible
            //listener?.hideBottomNavigation()
        }


        //Password Manager Screen
        cardPasswrodManager=view.findViewById(R.id.cardPasssword)
        cardPasswrodManager.setOnClickListener {
            // Hide bottom navigation when this fragment is visible
            listener?.hideBottomNavigation()
            loadFragment(PasswordManagerFragment())
        }

    }

    private fun loadFragment(fragment: Fragment){
        val transaction =childFragmentManager.
        beginTransaction()
        transaction.add(R.id.childFragmentContainer, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}