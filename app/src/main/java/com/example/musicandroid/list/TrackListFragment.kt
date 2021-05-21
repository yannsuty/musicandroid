package com.example.musicandroid.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.musicandroid.databinding.FragmentTrackListBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class TrackListFragment : Fragment() {

    private var _binding: FragmentTrackListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    //Adapter for list
    private val adapter = TrackAdapter(listOf())

    //Layout for list
    private val layoutManager = LinearLayoutManager(context)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTrackListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerviewTrack.adapter = this.adapter
        binding.recyclerviewTrack.layoutManager = this.layoutManager

        val listeTracks = arrayListOf<String>().apply {
            add("Test1")
            add("Test2")
            add("Test3")
            add("Test4")
            add("Test5")
        }
        adapter.setDataSet(listeTracks)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}