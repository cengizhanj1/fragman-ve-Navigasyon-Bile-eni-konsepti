package com.cengizhan.fragmentvenavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cengizhan.fragmentvenavigationcomponent.databinding.FragmentSayfaABinding
import androidx.navigation.fragment.findNavController


class SayfaAFragment : Fragment(R.layout.fragment_sayfa_a) {

    private var _binding: FragmentSayfaABinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentSayfaABinding.bind(view)


        binding.goToSayfaBButton.setOnClickListener {
            findNavController().navigate(R.id.action_sayfaAFragment_to_sayfaBFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}