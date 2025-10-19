package com.example.androidregistrationformapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidregistrationformapp.databinding.ActivitySummaryBinding
import androidx.core.net.toUri

class SummaryActivity : AppCompatActivity() {

    lateinit var user: User

    private lateinit var binding: ActivitySummaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySummaryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        retrieveUser()
        displayUser()
        setupClickListeners()
    }

    private fun retrieveUser() {
        user = intent.getSerializableExtra("User") as User
    }

    private fun displayUser() {
        val fullName = "${user.title} ${user.firstName} ${user.lastName}".trim()
        binding.textViewUserFullName.text = fullName
        binding.textViewEmailAddress.text = user.email
        binding.textViewPhone.text = user.phone
    }

    private fun setupClickListeners() {
        binding.textViewEmailAddress.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = "mailto:${user.email}".toUri()
            startActivity(intent)
        }

        binding.textViewPhone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = "tel:${user.phone}".toUri()
            startActivity(intent)
        }
    }

}