package corp.hun.hunexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import corp.hun.hunexample.databinding.ActivityMainBinding
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity() {
    private var count = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        with(binding) {
            btnCount.setOnClickListener {
                tvCount.text = count++.toString()
            }
            btnDownloadUserData.setOnClickListener {
                CoroutineScope(Dispatchers.IO).launch {
                    downloadUserData()
                }
            }
        }

        setContentView(binding.root)
    }

    private suspend fun downloadUserData() {

        withContext(Dispatchers.Main) {
            for (i in 1..200000) {
                binding.tvUserMessage.text =
                    String.format("Downloading user $i in ${Thread.currentThread().name}")
                delay(10)
            }
        }
    }
}