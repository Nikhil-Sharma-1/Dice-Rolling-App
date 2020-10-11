package com.example.dice

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice.addAnimatorListener(object : Animator.AnimatorListener {

            override fun onAnimationStart(animation: Animator?) {

            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationRepeat(animation: Animator?) {

            }
            override fun onAnimationEnd(animation: Animator?) {
                hideDice()
                val random = (1..6).random()
                number.text = random.toString()
            }
        })
    }



    fun onButtonClicked(view: View) {
        showDice();
        dice.playAnimation()
    }

    private fun showDice() {
        dice.visibility = View.VISIBLE
        number.visibility = View.GONE
        roll.isEnabled = false
    }
    private fun hideDice() {
        dice.visibility = View.GONE
        number.visibility = View.VISIBLE
        roll.isEnabled = true
    }
}