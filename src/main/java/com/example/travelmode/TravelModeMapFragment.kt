package com.example.travelmode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.travelmode.databinding.FragmentTravelModeMapBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TravelModeMapFragment : Fragment() {

    private val selectNationViewModel: SelectNationViewModel by activityViewModels()

    //private val filterViewModel: FilterViewModel by activityViewModels()

    private val nationFragment = SelectNationFragment()

    /** 공유 뷰모델 */
    //private val mapSharedViewModel: MapSharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentTravelModeMapBinding.inflate(layoutInflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.constraintLayout.setOnClickListener {
            nationFragment.show(childFragmentManager, "dialog")
        }
        //binding.mapShareViewModel = mapSharedViewModel

        selectNationViewModel.selected.observe(viewLifecycleOwner) {
            if (nationFragment.isVisible)
                nationFragment.dismiss()

            it.nationLocation?.let { it ->

            }

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

        selectNationViewModel.restaurants.observe(viewLifecycleOwner) {

        }

        binding.viewModel = selectNationViewModel
        return binding.root
    }
}