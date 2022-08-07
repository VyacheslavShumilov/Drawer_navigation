package com.hfad.drawernavigation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hfad.drawernavigation.R
import com.hfad.drawernavigation.databinding.FragmentSiteBinding

class SiteFragment : Fragment() {
    private lateinit var binding: FragmentSiteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSiteBinding.inflate(inflater, container, false)
        return binding.root
    }


}