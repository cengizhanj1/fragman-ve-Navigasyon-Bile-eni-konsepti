package com.cengizhan.fragmentvenavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.cengizhan.fragmentvenavigationcomponent.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment(R.layout.fragment_sayfa_y) {

    private var _binding: FragmentSayfaYBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentSayfaYBinding.bind(view)

        // Ana Sayfa'ya geri dönmek için buton
        binding.goToAnaSayfaButton.setOnClickListener {
            findNavController().navigate(R.id.action_sayfaYFragment_to_anaSayfaFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

