package com.bignerdranch.android.beatbox

import android.widget.SeekBar


class RateSeekBar(private val seekBar: SeekBar) {

    var progress = getRate(seekBar.progress)

    fun init(){
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                progress = getRate(this@RateSeekBar.seekBar.progress)
            }

        })
    }

    private fun getRate(p: Int) = p*0.5f+0.5f
}