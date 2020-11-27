package br.com.douglasmotta.jetpackdatastore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.douglasmotta.jetpackdatastore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }
    }
}