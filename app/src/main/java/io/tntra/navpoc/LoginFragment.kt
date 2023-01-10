package io.tntra.navpoc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import io.tntra.navpoc.databinding.FragmentFirstBinding
import io.tntra.navpoc.databinding.FragmentLoginBinding

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val binding = FragmentLoginBinding.bind(view)
        binding.loginbtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navigate_to_logout)
        }
        return view
    }

}