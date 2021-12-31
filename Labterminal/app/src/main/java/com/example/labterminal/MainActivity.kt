
import com.example.labterminal.R


import android.content.BroadcastReceiver
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.content.Intent
import android.content.IntentFilter
import android.media.MediaPlayer
import android.view.View

import android.widget.Toast
import com.example.labterminal.MyReceiver


class MainActivity : AppCompatActivity() {
    lateinit var receiver: MyReceiver
    lateinit var player: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var start_btn=findViewById<Button>(R.id.button2)

        var receiver = MyReceiver()



        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver,it)

        }


    }

    fun broadcast(view: View) {
        var intent=Intent()
        intent.setAction("custom_intent")
        sendBroadcast(intent)
    }
    private val mMessageReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            // Extract data included in the Intent
            val message = intent.action
            Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
        }
    }}