package io.tntra.navpoc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import io.tntra.navpoc.databinding.FragmentFirstBinding


/**
 * A simple [Fragment] subclass.
 * Use the [firstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class firstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val binding = FragmentFirstBinding.bind(view)
        binding.textView1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navigate_to_secondFragment)
        }
        return view
    }
}