package com.cvargas.codelabs.core.toast

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.cvargas.codelabs.R
import com.cvargas.codelabs.databinding.FragmentToastSnakeBinding


class ToastSnakeFragment : Fragment(R.layout.fragment_toast_snake) {

    private lateinit var binding: FragmentToastSnakeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentToastSnakeBinding.bind(view)
    }
}