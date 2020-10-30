package io.gripxtech.odoojsonrpcclient.instancias.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "instancias", primaryKeys = ["_id", "server_id"])
data class instancias (

    @Expose
    @ColumnInfo(name = "_id")
    var _id: Long = 0,

    @Expose
    @SerializedName("server_id")
    @ColumnInfo(name = "server_id")
    var serverId: Long = 0,

    @Expose
    @SerializedName("url")
    @ColumnInfo(name = "url")
    var url: String,

    @Expose
    @SerializedName("name")
    @ColumnInfo(name = "name")
    var name: String,

    @Expose
    @SerializedName("stateId")
    @ColumnInfo(name = "stateId")
    var stateId: Long = 0



): Parcelable {
    companion object {
        @JvmField
        val fieldsMap: Map<String, String> = mapOf(
            "_id" to "_id",
            "serverId" to "serverId",
            "url" to "url",
            "name" to "name",
            "stateId" to "stateId"
        )
        @JvmField
        val fields: ArrayList<String> = fieldsMap.keys.toMutableList() as ArrayList<String>
    }
}

