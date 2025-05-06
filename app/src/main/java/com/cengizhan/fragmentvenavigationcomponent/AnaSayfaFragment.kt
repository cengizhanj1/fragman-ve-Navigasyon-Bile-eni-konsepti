package com.cengizhan.fragmentvenavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.findNavController

class AnaSayfaFragment : Fragment(R.layout.fragment_ana_sayfa) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Butonlar için tıklama olaylarını ayarla
        val goToSayfaAButton = view.findViewById<Button>(R.id.goToSayfaAButton)
        val goToSayfaXButton = view.findViewById<Button>(R.id.goToSayfaXButton)

        goToSayfaAButton.setOnClickListener {
            findNavController().navigate(R.id.action_anaSayfaFragment_to_sayfaAFragment)
        }

        goToSayfaXButton.setOnClickListener {
            findNavController().navigate(R.id.action_anaSayfaFragment_to_sayfaXFragment)
        }
    }
}