package com.hfad.drawernavigation.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hfad.drawernavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("onViewCreated:", "onViewCreated")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("onAttach:", "onAttach")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("onDetach:", "onDetach")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("onDestroyView:", "onDestroyView")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart:", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume:", "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop:", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy:", "onDestroy")
    }

}