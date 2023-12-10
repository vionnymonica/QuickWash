package com.example.register.editprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.register.R
import com.example.register.profile.ProfileActivity

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val button: Button = findViewById(R.id.btn_save)

        button.setOnClickListener {
            val intent = Intent(this@EditProfileActivity, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}