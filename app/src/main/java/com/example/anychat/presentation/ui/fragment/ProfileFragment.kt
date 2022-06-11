package com.example.anychat.presentation.ui.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.anychat.R
import com.example.anychat.databinding.FragmentProfileBinding
import com.example.anychat.databinding.FragmentRegistrationBinding
import com.example.anychat.presentation.vm.RegistrationFragmentVM
import org.koin.androidx.viewmodel.ext.android.viewModel


class ProfileFragment : Fragment() {
    lateinit var binding : FragmentProfileBinding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.logoutBtn.setOnClickListener {
            context?.deleteSharedPreferences("token")
            findNavController().navigate(R.id.loginFragment)
        }

    }
}