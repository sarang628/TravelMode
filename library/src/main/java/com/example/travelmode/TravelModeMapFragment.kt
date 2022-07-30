package com.example.travelmode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import com.example.travelmode.databinding.FragmentTravelModeMapBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import androidx.lifecycle.repeatOnLifecycle
import com.example.torang_core.util.Logger
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class TravelModeMapFragment : Fragment() {
    private val viewModel: SelectNationViewModel by activityViewModels()
    private val nationFragment = SelectNationFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentTravelModeMapBinding.inflate(layoutInflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.constraintLayout.setOnClickListener {
            nationFragment.show(childFragmentManager, "dialog")
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.selectedNation.collect {
                    Logger.d(it.toString())
                }
            }
        }

        viewModel.selected.observe(viewLifecycleOwner) {
            if (nationFragment.isVisible)
                nationFragment.dismiss()

            it?.let {
                /*if (it.nationBound == null) {
                    mapSharedViewModel.searchFilterRestaurant(
                        northEastLatitude = 0.0,
                        southWestLatitude = 0.0,
                        northEastLongitude = 0.0,
                        southWestLongitude = 0.0,
                        searchType = Filter.SearchType.BOUND
                    )
                } else {
                    it.nationBound?.let { nationBound ->
                        mapSharedViewModel.searchFilterRestaurant(
                            northEastLatitude = nationBound.latitudeNorthEast,
                            southWestLatitude = nationBound.latitudeSouthWest,
                            northEastLongitude = nationBound.longitudeNorthEast,
                            southWestLongitude = nationBound.longitudeSouthWest,
                            searchType = Filter.SearchType.BOUND
                        )
                    }
                }*/
            }
        }

        viewModel.restaurants.observe(viewLifecycleOwner) {
        }

        binding.viewModel = viewModel
        return binding.root
    }
}