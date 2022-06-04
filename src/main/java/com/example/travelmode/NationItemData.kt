package com.example.travelmode

import com.example.torang_core.data.NationBound
import com.example.torang_core.data.NationItem
import com.example.torang_core.data.NationLocation


class NationItemData {
    companion object {
        fun KOREA(): NationItem {
            return NationItem(
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
        }
    }
}