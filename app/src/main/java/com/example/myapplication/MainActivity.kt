package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.LoginFilter.UsernameFilterGMail
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R.id.editTextPassword

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.editTextUsername)
        val password = findViewById<EditText>(R.id.editTextPassword)

        var usernametext = username.text.toString()
        var passwordtext = password.text.toString()

        var buttonsubmit = findViewById<Button>(R.id.buttonSubmit)

        buttonsubmit.setOnClickListener {
            if (usernametext.isBlank() || passwordtext.isBlank()) {
                Toast.makeText(
                    this,
                    "username & password tidak boleh kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this,
                    "Login diproses..",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        val buttonDaftar = findViewById<Button>(R.id.buttondaftar)
        buttonDaftar.setOnClickListener {
            val intentPindahPendaftaran = Intent(this, PendaftaranActivity::class.java)
            startActivity(intentPindahPendaftaran)
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}