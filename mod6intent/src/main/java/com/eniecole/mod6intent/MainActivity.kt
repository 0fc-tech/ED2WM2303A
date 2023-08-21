package com.eniecole.mod6intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import android.Manifest

class MainActivity : AppCompatActivity() {
    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()){
            isGranted ->
        if(isGranted) startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel:0612345678")))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Comment changer d'activité : INTENT EXPLICITE
        //val intentToSettings = Intent(this,SettingsActivity::class.java)
        //startActivity(intentToSettings)
        //Pour un service
        //startService(MonIntent)
        //Pour un broadcast
        //sendBroadcast(MonIntent)

        //Exemple intent IMPLICITE:
                                   //Intent.CALL -> Demande la permission d'appel
        //val intentTelephone = Intent(Intent.ACTION_VIEW, Uri.parse("geo:43.3423432,-0.346"))
        //startActivity(intentTelephone)
        permissionLauncher.launch(Manifest.permission.CALL_PHONE)
    }
}











