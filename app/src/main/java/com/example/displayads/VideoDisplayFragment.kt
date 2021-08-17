package com.example.displayads

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.displayads.databinding.FragmentFullscreenBinding
import com.example.displayads.databinding.FragmentVideoDisplayBinding

class VideoDisplayFragment : Fragment() {

    lateinit var binding: FragmentVideoDisplayBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVideoDisplayBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}