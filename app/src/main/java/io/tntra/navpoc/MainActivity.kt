package io.tntra.navpoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.tntra.navpoc.databinding.FragmentFirstBinding

class MainActivity: AppCompatActivity() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}