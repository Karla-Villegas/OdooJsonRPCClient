package io.gripxtech.odoojsonrpcclient.territorial.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "res.country.state", primaryKeys = ["_id", "server_id"])
data class res_country_state (

    @Expose
    @ColumnInfo(name = "_id")
    var _id: Long = 0,

    @Expose
    @SerializedName("server_id")
    @ColumnInfo(name = "server_id")
    var serverId: Long = 0,

    @Expose
    @SerializedName("name")
    @ColumnInfo(name = "name")
    var name: String

): Parcelable {
    companion object {
        @JvmField
        val fieldsMap: Map<String, String> = mapOf(
            "id" to "id",
            "serverId" to "serverId",
            "name" to "name"
        )
        @JvmField
        val fields: ArrayList<String> = fieldsMap.keys.toMutableList() as ArrayList<String>
    }
}