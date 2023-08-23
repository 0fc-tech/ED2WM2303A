package com.eniecole.tplaunchdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.eniecole.tplaunchdice.databinding.ActivityLaunchDiceBinding

class LaunchDiceActivity : AppCompatActivity() {
    lateinit var binding: ActivityLaunchDiceBinding
    val vm by viewModels<LaunchDiceVM>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_launch_dice)
        binding.vm = vm
        binding.lifecycleOwner = this
    }
    fun onLaunch(view: View){
        if(view is Button){
            vm.launchDice(view.text.toString().toInt())
        }
    }
}