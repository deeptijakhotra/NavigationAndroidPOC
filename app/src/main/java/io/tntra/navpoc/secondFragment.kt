package io.tntra.navpoc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import io.tntra.navpoc.databinding.FragmentFirstBinding
import io.tntra.navpoc.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass.
 * Use the [secondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class secondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val binding = FragmentSecondBinding.bind(view)
        binding.textView2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navigate_to_firstFragment)
        }
        return view
    }
}