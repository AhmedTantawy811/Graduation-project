package com.example.graduationproject.Ui.registration.userProfail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.graduationproject.R
import com.example.graduationproject.Ui.registration.sing_in.Sing_in

class UserProfaile : AppCompatActivity() {
    lateinit var DoneButton: Button
    lateinit var textField: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profaile)
        DoneButton=findViewById(R.id.done_butt)
        DoneButton.setOnClickListener {
            SingInScreenIntent()
        }

        val items = listOf("Material", "Design", "Components", "Android")
        textField=findViewById(R.id.autoComplete)
        val adapter = ArrayAdapter(this, R.layout.dropdown_mune, items)
        textField.setAdapter(adapter)
        textField.onItemClickListener=AdapterView.OnItemClickListener{
            parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSelected= parent?.getItemAtPosition(position)
            Toast.makeText(this,"item :$itemSelected",Toast.LENGTH_LONG).show()
        }
    }



    private fun SingInScreenIntent() {
        val SingInIntent= Intent(this, Sing_in::class.java)
        startActivity(SingInIntent)
        finish()

    }
}