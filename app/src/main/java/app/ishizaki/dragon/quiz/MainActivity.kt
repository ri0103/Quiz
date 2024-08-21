package app.ishizaki.dragon.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ishizaki.dragon.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        val quizIntent: Intent = Intent(this, QuizActivity::class.java)

        binding.startButton.setOnClickListener {
            startActivity(quizIntent)
        }
    }
}