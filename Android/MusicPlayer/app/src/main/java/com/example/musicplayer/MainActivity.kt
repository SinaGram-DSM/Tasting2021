package com.example.musicplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private var isRunning = false
    private lateinit var mp : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mp = MediaPlayer.create(this, R.raw.ash_island_melody)
        seekBar.max = mp.duration // 음악의 총 길이를 seekBar 에 적용

        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if(fromUser){ // 사용자가 seekBar 를 움직이면
                    mp.seekTo(progress) // 재생위치를 바꿔준다 (움직인 곳에서 음악 재생)
                }

                val min:Int = mp.duration/60000
                val sec:Int = (mp.duration-60000*min)/1000

                val min2:Int = mp.currentPosition/60000
                val sec2:Int = (mp.currentPosition-60000*min2)/1000

                current_tv.text = String.format("%01d:%02d", min2, sec2)
                end_tv.text = String.format("%01d:%02d", min, sec)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })

        fab.setOnClickListener{ // 실행중인지에 따라 버튼 이미지와 소리 재생 여부 판단
            isRunning = !isRunning

            if(isRunning)
                start()
            else{
                pause()
            }

        }
    }

    private fun start(){
        fab.setImageResource(R.drawable.ic_baseline_pause_24)
        mp.start()

        Thread(object: Runnable { //쓰레드 생성
            override fun run() {
                while(mp.isPlaying){ // 음악이 실행중일 때 계속 돌아가게 함
                    try{
                        Thread.sleep(1000) // 1초마다 seekBar 움직이기
                    } catch (e : Exception){
                        e.printStackTrace()
                    }
                    seekBar.setProgress(mp.currentPosition)
                }
            }
        }).start()
    }

    private fun pause(){
        fab.setImageResource(R.drawable.ic_baseline_play_arrow_24)
        mp.pause()
    }
}