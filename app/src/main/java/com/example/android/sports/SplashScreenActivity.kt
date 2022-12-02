package com.example.android.sports

//TODO 3: Saat aplikasi berhasil di install kemudian dijalankan maka akan menjalankan activity SplashSreenActivity.kt ini
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.android.sports.R
import com.example.android.sports.databinding.ActivitySplashScreenBinding
import com.example.android.sports.MainActivity
import java.util.*

class SplashScreenActivity : AppCompatActivity() {
    //membuat fungsi onCreate untuk activity ini.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Membuat variabel splashScreenBinding
        //Memanggil ActivitySplashScreen menggunakan Binding sebagai layoutnya
        val splashScreenBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(splashScreenBinding.root)

        //Mengaktifkan activity MainActivity setelah 4000 milidetik.
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, 4000)

    }
}