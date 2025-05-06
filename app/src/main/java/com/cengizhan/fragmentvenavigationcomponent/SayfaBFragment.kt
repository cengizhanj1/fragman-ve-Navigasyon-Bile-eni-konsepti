package com.cengizhan.fragmentvenavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.cengizhan.fragmentvenavigationcomponent.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment(R.layout.fragment_sayfa_b) {

    private var _binding: FragmentSayfaBBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentSayfaBBinding.bind(view)


        binding.goToSayfaYButton.setOnClickListener {
            findNavController().navigate(R.id.action_sayfaBFragment_to_sayfaYFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

