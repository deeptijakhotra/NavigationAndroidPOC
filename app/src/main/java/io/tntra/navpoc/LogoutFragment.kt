package io.tntra.navpoc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import io.tntra.navpoc.databinding.FragmentFirstBinding
import io.tntra.navpoc.databinding.FragmentLogoutBinding

/**
 * A simple [Fragment] subclass.
 * Use the [LogoutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LogoutFragment : Fragment() {
    private lateinit var binding: FragmentLogoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_logout, container, false)
        val binding = FragmentLogoutBinding.bind(view)
        binding.logoutbtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navigate_to_login)
        }
        return view
    }
}