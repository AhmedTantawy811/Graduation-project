package com.example.graduationproject.Ui.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.graduationproject.R


class OnBoardingFragment(private val page: page ) : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=  inflater.inflate(R.layout.fragment_on_boarding, container, false)
        val titleText=view.findViewById<TextView>(R.id.onbordingTitel_text)
        val descText=view.findViewById<TextView>(R.id.onbordingDec_text)
        val imageView=view.findViewById<ImageView>(R.id.onbording_image)

        titleText.text=page.titel
        descText.text=page.desc
        imageView.setImageResource(page.image)
        return view

    }


}