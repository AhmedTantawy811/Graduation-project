package com.example.graduationproject.Ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.graduationproject.R

class HomeActivity : Fragment() {
    lateinit var cardHealthyRecord:CardView
   /* override fun onCreated(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }*/



           override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
      ): View? {

    return inflater.inflate(R.layout.activity_home, container, false)

}
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*cardHealthyRecord=view.findViewById(R.id.card1)
        cardHealthyRecord.setOnClickListener {


        }*/
    }
}