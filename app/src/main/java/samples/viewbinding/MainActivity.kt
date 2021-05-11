package samples.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast.LENGTH_SHORT
import android.widget.Toast.makeText
import samples.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Inflate the activity layout and then set it's view
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Now we can use any of the views available in the layout via "binding." and the id
        //Super simple, right? :D

        binding.button.setOnClickListener {
            val text = binding.editTextTextPersonName.text
            if (text.isNotBlank()) {
                makeText(this, text, LENGTH_SHORT).show()
            } else {
                binding.editTextTextPersonName.error = "Por favor, insira um texto"
            }
        }

    }
}