package com.eniecole.tplaunchdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.eniecole.tplaunchdice.databinding.ActivityLaunchDiceBinding

class LaunchDiceActivity : AppCompatActivity() {
    lateinit var binding: ActivityLaunchDiceBinding
    val vm by viewModels<LaunchDiceVM>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_launch_dice)
        //binding.textViewValueDice.text = vm.valeurDe.toString()
        binding.buttonLaunch4.setOnClickListener {
            vm.launchDice(4)
            //binding.textViewValueDice.text = vm.valeurDe.toString()

        }
        binding.buttonLaunch6.setOnClickListener {
            vm.launchDice(6)
            //binding.textViewValueDice.text = vm.valeurDe.toString()

        }
        binding.buttonLaunch12.setOnClickListener {
            vm.launchDice(12)
            //binding.textViewValueDice.text = vm.valeurDe.toString()

        }
        binding.buttonLaunch16.setOnClickListener {
            vm.launchDice(16)
            //binding.textViewValueDice.text = vm.valeurDe.toString()

        }
        binding.buttonLaunch20.setOnClickListener {
            vm.launchDice(20)
            //binding.textViewValueDice.text = vm.valeurDe.toString()

        }
        binding.buttonLaunch100.setOnClickListener {
            vm.launchDice(100)
            //binding.textViewValueDice.text = vm.valeurDe.toString()

        }
    }
}