package com.example.travelmode

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.torang_core.data.NationBound
import com.example.torang_core.data.NationItem
import com.example.torang_core.data.NationLocation
import com.example.torang_core.data.model.Filter
import com.example.torang_core.data.model.RestaurantData
import com.example.torang_core.repository.NationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SelectNationViewModel @Inject constructor(private val nationRepository: NationRepository) :
    ViewModel() {
    private val _selectdNation = MutableLiveData<NationItem>().apply {
        value = NationItem(R.drawable.southkorea, "Korea")
    }
    val selected: LiveData<NationItem> = _selectdNation

    val selectedNation = nationRepository.getSelectNationItem()

    /** 현재 맛집 리스트 */
    private val _restaurants = MutableLiveData<List<RestaurantData>>()
    val restaurants: LiveData<List<RestaurantData>> = _restaurants

    fun select(nationItem: NationItem) {
        _selectdNation.postValue(nationItem)
        viewModelScope.launch {
            nationRepository.selectNationItem(nationItem)
        }
    }

    fun findRestaurant(
        northEastLatitude: Double,
        southWestLatitude: Double,
        northEastLongitude: Double,
        southWestLongitude: Double
    ) {
        viewModelScope.launch {
            delay(7000)
            try {
                val filter = Filter().apply {
                    searchType = Filter.SearchType.BOUND
                    this.northEastLongitude = northEastLongitude
                    this.northEastLatitude = northEastLatitude
                    this.southWestLongitude = southWestLongitude
                    this.southWestLatitude = southWestLatitude
                }
                _restaurants.postValue(nationRepository.getFilterRestaurant(filter))

            } catch (e: Exception) {

            }
        }
    }

    private val _nationItems = MutableLiveData<ArrayList<NationItem>>().apply {
        value = ArrayList()
        value.apply {
            this?.add(
                NationItem(
                    R.drawable.brazil,
                    "brazil",
                    NationLocation(-15.783454397264483, -47.874050758127595),
                    NationBound(
                        latitudeNorthEast = -15.280181490835163,
                        latitudeSouthWest = -16.285480825113854,
                        longitudeNorthEast = -47.60438606142998,
                        longitudeSouthWest = -48.1437149271369
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.canada,
                    "canada",
                    NationLocation(45.4250860262407, -75.70045694798073),
                    NationBound(
                        latitudeNorthEast = 45.79050245404548,
                        latitudeSouthWest = 45.057288791717525,
                        longitudeNorthEast = -75.43079249560833,
                        longitudeSouthWest = -75.97012136131525
                    )

                )
            )
            this?.add(
                NationItem(
                    R.drawable.china,
                    "china",
                    NationLocation(39.88255421230174, 116.4064242999756),
                    NationBound(
                        latitudeNorthEast = 40.28221234912219,
                        latitudeSouthWest = 39.480552913207866,
                        longitudeNorthEast = 116.67608845978975,
                        longitudeSouthWest = 116.13675959408285
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.greece,
                    "greece",
                    NationLocation(37.98892837826318, 23.732605497802364),
                    NationBound(
                        latitudeNorthEast = 38.39945136983413,
                        latitudeSouthWest = 37.57609505904062,
                        longitudeNorthEast = 24.002269729971886,
                        longitudeSouthWest = 23.462940864264965
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.hongkong,
                    "hongkong",
                    NationLocation(22.29753969263335, 114.17215632753884),
                    NationBound(
                        latitudeNorthEast = 22.77999058494387,
                        latitudeSouthWest = 21.813416540598524,
                        longitudeNorthEast = 114.44182075560093,
                        longitudeSouthWest = 113.90249188989401
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.hungary,
                    "hungary",
                    NationLocation(47.49631879682233, 19.03992565978393),
                    NationBound(
                        latitudeNorthEast = 47.84805236747122,
                        latitudeSouthWest = 47.142212967047946,
                        longitudeNorthEast = 19.309589825570583,
                        longitudeSouthWest = 18.770260959863663
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.india,
                    "india",
                    NationLocation(28.61427711934326, 77.19935203335108),
                    NationBound(
                        latitudeNorthEast = 29.071824534236075,
                        latitudeSouthWest = 28.154727272395547,
                        longitudeNorthEast = 77.46901620179415,
                        longitudeSouthWest = 76.92968733608723
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.indonesia,
                    "indonesia",
                    NationLocation(-6.172737100934231, 106.83500496378585),
                    NationBound(
                        latitudeNorthEast = -5.653167796222001,
                        latitudeSouthWest = -6.691796782309222,
                        longitudeNorthEast = 107.10466917604208,
                        longitudeSouthWest = 106.56534031033516
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.japan,
                    "japan",
                    NationLocation(35.685355894040114, 139.7529295567316),
                    NationBound(
                        latitudeNorthEast = 36.10849537909145,
                        latitudeSouthWest = 35.2599597189603,
                        longitudeNorthEast = 140.02259396016598,
                        longitudeSouthWest = 139.48326509445906
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.laos,
                    "laos",
                    NationLocation(17.97104559449185, 102.61856095543412),
                    NationBound(
                        latitudeNorthEast = 18.46720707057223,
                        latitudeSouthWest = 17.47348649584191,
                        longitudeNorthEast = 102.88822520524263,
                        longitudeSouthWest = 102.34889633953571
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.malaysia,
                    "malaysia",
                    NationLocation(3.1383303434154786, 101.68698887532281),
                    NationBound(
                        latitudeNorthEast = 3.6597594621236693,
                        latitudeSouthWest = 2.6166406348362328,
                        longitudeNorthEast = 101.95665311068296,
                        longitudeSouthWest = 101.41732424497604
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.mexico,
                    "mexico",
                    NationLocation(19.422144328843867, -99.18067296180162),
                    NationBound(
                        latitudeNorthEast = 19.91401726796639,
                        latitudeSouthWest = 18.928777412880798,
                        longitudeNorthEast = -98.91100846230984,
                        longitudeSouthWest = -99.45033732801676
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.namibia,
                    "namibia",
                    NationLocation(-22.567800331187698, 17.087158484978882),
                    NationBound(
                        latitudeNorthEast = -22.084609390456208,
                        latitudeSouthWest = -23.049303113615593,
                        longitudeNorthEast = 17.35682263970375,
                        longitudeSouthWest = 16.81749377399683
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.netherlands,
                    "netherlands",
                    NationLocation(52.35880710045552, 4.879654220583688),
                    NationBound(
                        latitudeNorthEast = 52.67666342410958,
                        latitudeSouthWest = 52.03864763413944,
                        longitudeNorthEast = 5.149318613111973,
                        longitudeSouthWest = 4.609989747405052
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.newzealand,
                    "new zealand",
                    NationLocation(-41.290141953404685, 174.78214237751914),
                    NationBound(
                        latitudeNorthEast = -40.896479756173285,
                        latitudeSouthWest = -41.681442585761424,
                        longitudeNorthEast = 175.05180649459362,
                        longitudeSouthWest = 174.5124776288867
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.norway,
                    "norway",
                    NationLocation(59.91743263567293, 10.728297479063489),
                    NationBound(
                        latitudeNorthEast = 60.178228247603826,
                        latitudeSouthWest = 59.654571409804966,
                        longitudeNorthEast = 10.99796187132597,
                        longitudeSouthWest = 10.458633005619049
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.philippines,
                    "philippines",
                    NationLocation(14.599136612998063, 120.97544020140991),
                    NationBound(
                        latitudeNorthEast = 15.104034379733775,
                        latitudeSouthWest = 14.093076904281098,
                        longitudeNorthEast = 121.24510444700718,
                        longitudeSouthWest = 120.70577558130027
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.portugal,
                    "portugal",
                    NationLocation(38.71246927681961, -9.139329905738416),
                    NationBound(
                        latitudeNorthEast = 39.118892610927155,
                        latitudeSouthWest = 38.30372162548001,
                        longitudeNorthEast = -8.86966522783041,
                        longitudeSouthWest = -9.40899409353733
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.romania,
                    "romania",
                    NationLocation(44.428383664232136, 26.0879440789849),
                    NationBound(
                        latitudeNorthEast = 44.800216792567234,
                        latitudeSouthWest = 44.05416960695083,
                        longitudeNorthEast = 26.357608325779438,
                        longitudeSouthWest = 25.818279460072517
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.sanmarino,
                    "san marino",
                    NationLocation(43.93490774407734, 12.447414340844801),
                    NationBound(
                        latitudeNorthEast = 44.309876885933214,
                        latitudeSouthWest = 43.5575590372445,
                        longitudeNorthEast = 12.717078477144241,
                        longitudeSouthWest = 12.17774961143732
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.southkorea,
                    "south korea",
                    NationLocation(37.55136363234369, 126.99115206585131),
                    NationBound(
                        latitudeNorthEast = 37.964334513417114,
                        latitudeSouthWest = 37.13609172066124,
                        longitudeNorthEast = 127.26081646978855,
                        longitudeSouthWest = 126.72148760408164
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.sweden,
                    "sweden",
                    NationLocation(59.32715024864944, 18.071433368065797),
                    NationBound(
                        latitudeNorthEast = 59.59257651676415,
                        latitudeSouthWest = 59.05963453463248,
                        longitudeNorthEast = 18.34109779447317,
                        longitudeSouthWest = 17.80176892876625
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.switzerland,
                    "switzerland",
                    NationLocation(46.9489662118128, 7.4499490734826965),
                    NationBound(
                        latitudeNorthEast = 47.30436055206898,
                        latitudeSouthWest = 46.59119596077913,
                        longitudeNorthEast = 7.719613462686539,
                        longitudeSouthWest = 7.180284596979618
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.thailand,
                    "thailand",
                    NationLocation(13.776973444553207, 100.49853863654901),
                    NationBound(
                        latitudeNorthEast = 14.283738237705776,
                        latitudeSouthWest = 13.269106687325706,
                        longitudeNorthEast = 100.76820284128189,
                        longitudeSouthWest = 100.22887397557497
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.ukraine,
                    "ukraine",
                    NationLocation(50.437748897015965, 30.553636048252706),
                    NationBound(
                        latitudeNorthEast = 50.769273609775766,
                        latitudeSouthWest = 50.10388553512823,
                        longitudeNorthEast = 30.823300257325172,
                        longitudeSouthWest = 30.283971391618252
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.uruguay,
                    "uruguay",
                    NationLocation(-34.89933713637825, -56.1963900948514),
                    NationBound(
                        latitudeNorthEast = -34.46981187900326,
                        latitudeSouthWest = -35.326627329561596,
                        longitudeNorthEast = -55.926725417375565,
                        longitudeSouthWest = -56.466054283082485
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.usa,
                    "usa",
                    NationLocation(38.892021555011965, -77.04887800729838),
                    NationBound(
                        latitudeNorthEast = 39.297417685814544,
                        latitudeSouthWest = 38.48429813774104,
                        longitudeNorthEast = -76.77921339869499,
                        longitudeSouthWest = -77.31854226440191
                    )
                )
            )
            this?.add(
                NationItem(
                    R.drawable.vietnam,
                    "vietnam",
                    NationLocation(10.78387890704643, 106.67841904951607),
                    NationBound(
                        latitudeNorthEast = 11.296559630924333,
                        latitudeSouthWest = 10.270322360582128,
                        longitudeNorthEast = 106.94808315485716,
                        longitudeSouthWest = 106.40875428915024
                    )
                )
            )
        }
    }
    val nationItems: LiveData<ArrayList<NationItem>> = _nationItems
}