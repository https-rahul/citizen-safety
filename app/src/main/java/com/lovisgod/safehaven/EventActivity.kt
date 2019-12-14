package com.lovisgod.safehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Switch
import android.widget.TextView

class EventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)
        var contact_personnel: TextView = findViewById(R.id.contact_personnel)
        var event_box: TextView = findViewById(R.id.event_box)
        var locationEnabler: Switch = findViewById(R.id.location_swith)
        var send_button: Button = findViewById(R.id.send_button)

        var personel = Intent().getStringExtra("whoto")
        Log.i("whoto", "personel is -> $personel")

        contact_personnel.text = "Contact $personel"
    }
}