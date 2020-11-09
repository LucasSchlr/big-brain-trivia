package com.example.bigbraintrivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bigbraintrivia.leaderboard.LeaderBoardActivity
import com.example.bigbraintrivia.question.QuestionActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        regularButton.setOnClickListener{
            LeaderBoardActivity.open(this)
        }
    }
}
