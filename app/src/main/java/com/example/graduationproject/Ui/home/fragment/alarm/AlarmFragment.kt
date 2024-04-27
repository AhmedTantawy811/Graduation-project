package com.example.graduationproject.Ui.home.fragment.alarm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.graduationproject.R
import com.example.graduationproject.Ui.home.fragment.settings.child_setting.UserProfileEditFragment


class AlarmFragment : Fragment() {

lateinit var addButton: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alarm, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addButton=view.findViewById(R.id.add_ic)
        addButton.setOnClickListener {
            loadFragment(AddAlarmFragment())
            Toast.makeText(context, "This is a short toast message", Toast.LENGTH_SHORT).show()
        }
    }
    private fun loadFragment(fragment: Fragment){
         childFragmentManager.
        beginTransaction()
        .replace(R.id.childFragmentContainerAlarm, fragment)
        .addToBackStack(null)
        .commit()
    }
}