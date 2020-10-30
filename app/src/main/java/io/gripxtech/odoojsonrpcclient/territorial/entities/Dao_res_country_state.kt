package io.gripxtech.odoojsonrpcclient.territorial.entities

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface Dao_res_country_state {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRegistroEstado(RegistroEstado: res_country_state): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRegistrosEstados(RegistrosEtados: List<res_country_state>): List<Long>

    @Query("SELECT * FROM `res.country.state`")
    fun getRegistrosAllEstados(): List<res_country_state>

    @Query("SELECT * FROM `res.country.state` WHERE server_id = :serverId")
    fun getRecordeRegistrationsEstados(serverId:Long): List<res_country_state>

}