package com.srivatsa.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {

    private lateinit var image:ImageView



    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        image=findViewById(R.id.mrandroid)
        animsplash()

        handler= Handler()
        handler.postDelayed({

            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000) // 3 seconds delay to open the MainActivity
    }

    private fun animsplash() {
    val shake=AnimationUtils.loadAnimation(this,R.anim.shake_anim)
    image.animation=shake
    }
}
