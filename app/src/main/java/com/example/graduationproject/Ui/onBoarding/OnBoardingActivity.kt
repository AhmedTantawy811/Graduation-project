package com.example.graduationproject.Ui.onBoarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.graduationproject.R
import com.example.graduationproject.Ui.registration.sing_in.Sing_in
import com.example.graduationproject.Ui.registration.sing_up.Sing_up
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardingActivity : AppCompatActivity() {

private val onBordingChangeCallback=object : ViewPager2.OnPageChangeCallback(){
    override fun onPageSelected(position: Int) {
        super.onPageSelected(position)
        when(position){
            0->{
                nextBtn.text="Let’s Start"
                skipBtn.visible()
                nextBtn.visible()


            }
            pagerList.size- 1->{
                nextBtn.text="Get Started"
                skipBtn.gone()
                nextBtn.visible()


            }
            else-> {
                nextBtn.text = "Next"
                skipBtn.visible()
                nextBtn.visible()


            }
        }
    }
}

private val pagerList= arrayListOf(
    page("Hi,Farist Scareen ",R.drawable.onboarding1,"Hi,Farist Scareen 000000000"),
    page("Hi,Farist Scareen2",R.drawable.onboarding2,"Hi,Secand Scareen 000000000"),
    page("Hi,Farist Scareen3",R.drawable.onboarding3,"Hi,Farist33 Scareen 000000000")


)


lateinit var viewPager2: ViewPager2
lateinit var skipBtn: Button
lateinit var nextBtn: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        viewPager2 = findViewById(R.id.OnBordingviewpager2)
        skipBtn = findViewById(R.id.skip_butt)
        nextBtn = findViewById(R.id.next_butt)
        viewPager2()
    }




    private fun viewPager2(){
        viewPager2.apply {
            adapter = OnBoardingAdapter(this@OnBoardingActivity, pagerList)
            registerOnPageChangeCallback(onBordingChangeCallback)
            (getChildAt(0) as RecyclerView).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        }



            val tableLayout = findViewById<TabLayout>(R.id.tabLayout)
            TabLayoutMediator(tableLayout, viewPager2) { tab, position -> }.attach()

            nextBtn.setOnClickListener {
                if (viewPager2.currentItem < viewPager2.adapter!!.itemCount - 1) {
                    viewPager2.currentItem += 1
                } else {
                    homeScreenIntent()

                }

            }


            skipBtn.setOnClickListener {
                homeScreenIntent()

            }

        }

    override fun onDestroy() {
        viewPager2.unregisterOnPageChangeCallback(onBordingChangeCallback)
        super.onDestroy()
    }

    private fun homeScreenIntent() {
        val homeIntent= Intent(this, Sing_in::class.java)
        startActivity(homeIntent)
        finish()

    }
}