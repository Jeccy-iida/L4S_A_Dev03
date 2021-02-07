package app.iida.jessy.janken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random
import android.widget.TextView
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Player = findViewById<TextView>(R.id.Player)
        val cpu = findViewById<TextView>(R.id.cpu)
        val result = findViewById<TextView>(R.id.result)
        val gooButton = findViewById<Button>(R.id.gooButton)
        val chokiButton = findViewById<Button>(R.id.chokiButton)
        val paaButton = findViewById<Button>(R.id.paaButton)

        gooButton.setOnClickListener{
            Player.text ="あなたの手はグーです"
            val number: Int = Random.nextInt(3)

            when(number){
                0 -> {
                    cpu.text = "相手の手はグーです"
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
                1 -> {
                    cpu.text = "相手の手はチョキです"
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                2 -> {
                    cpu.text = "相手の手はパーです"
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))

                }
            }
        }

        chokiButton.setOnClickListener{
            Player.text ="あなたの手はチョキです"
            val number: Int = Random.nextInt(3)

            when(number){
                0 -> {
                    cpu.text = "相手の手はグーです"
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
                1 -> {
                    cpu.text = "相手の手はチョキです"
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
                2 -> {
                    cpu.text = "相手の手はパーです"
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))

                }
            }
        }

        paaButton.setOnClickListener{
            Player.text ="あなたの手はパーです"
            val number: Int = Random.nextInt(3)

            when(number){
                0 -> {
                    cpu.text = "相手の手はグーです"
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                1 -> {
                    cpu.text = "相手の手はチョキです"
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
                2 -> {
                    cpu.text = "相手の手はパーです"
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))

                }
            }
        }
    }
}