package com.example.musicandroid.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.musicandroid.API.CompetitionListResponse
import com.example.musicandroid.API.CompetitionApi
import com.example.musicandroid.R
import com.example.musicandroid.databinding.FragmentTrackListBinding
import com.example.musicandroid.model.Competition
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class CompetitionListFragment : Fragment() {

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

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.football-data.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val competitionApi: CompetitionApi = retrofit.create(CompetitionApi::class.java)

        competitionApi.getCompetitionList("TIER_ONE").enqueue(object: Callback<CompetitionListResponse> {
            override fun onFailure(call: Call<CompetitionListResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<CompetitionListResponse>, response: Response<CompetitionListResponse>) {
                if (response.isSuccessful) {
                    val pokemon_response = response.body()!!
                    adapter.setDataSet(pokemon_response.competitions)
                }
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}