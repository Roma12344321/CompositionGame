package com.dev.compositiongame.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dev.compositiongame.R
import com.dev.compositiongame.databinding.FragmentChooseLevelBinding
import java.lang.RuntimeException
import com.dev.compositiongame.domain.entity.Level


class ChooseLevelFragment : Fragment() {

    private var _binding: FragmentChooseLevelBinding? = null
    private val binding: FragmentChooseLevelBinding
        get() = _binding ?: throw RuntimeException("Null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseLevelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            buttonLevelEasy.setOnClickListener {
                startLevelFragment(Level.EASY)
            }
            buttonLevelNormal.setOnClickListener {
                startLevelFragment(Level.NORMAL)
            }
            buttonLevelHard.setOnClickListener {
                startLevelFragment(Level.HIGH)
            }
            buttonLevelTest.setOnClickListener {
                startLevelFragment(Level.TEST)
            }
        }
    }

    private fun startLevelFragment(level: Level) {
        findNavController().navigate(ChooseLevelFragmentDirections.actionChooseLevelFragmentToGameFragment(level))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        const val NAME = "ChooseLevelFragment"

        fun newInstance(): ChooseLevelFragment {
            return ChooseLevelFragment()
        }
    }
}