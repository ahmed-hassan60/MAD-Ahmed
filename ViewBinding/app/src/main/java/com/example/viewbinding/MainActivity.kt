package com.example.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.inflate
import android.widget.Toast
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import com.example.viewbinding.R


class MainActivity : AppCompatActivity() {
    lateinit var binding: ViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view =binding.root

        binding.btn1.setOnClickListener {
            Toast.makeText(this,"view binding",Toast.LENGTH_SHORT).show()
        }

    }
}

private fun Any.setOnClickListener(function: () -> Unit) {

}
