package com.cvargas.codelabs.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.cvargas.codelabs.R
import com.cvargas.codelabs.databinding.FragmentMainBinding
import com.cvargas.codelabs.util.FragmentExt.navTo


class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding.codelabToastSnake.setOnClickListener { navTo(R.id.toastSnakeFragment) }
    }
}