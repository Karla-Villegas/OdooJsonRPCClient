package io.gripxtech.odoojsonrpcclient.instancias.entities

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.gripxtech.odoojsonrpcclient.customer.entities.Customer
import io.gripxtech.odoojsonrpcclient.territorial.entities.res_country_state

@Dao
interface Dao_instancias {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertInstancia(Registrationinstancia: instancias): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertInstancias(Registrationsintancias: List<instancias>): List<Long>

    @Query("SELECT * FROM `instancias`")
    fun getAllIntancias(): List<instancias>

    @Query("SELECT * FROM `instancias` WHERE stateId = :stateId")
    fun getinstanciasById(stateId:Long): List<instancias>

    @Query("SELECT * FROM instancias WHERE name = :name")
    fun getInstanciasbyName(name: String) : List<instancias>

    @Query("SELECT EXISTS(SELECT * FROM instancias) AND EXISTS(SELECT * FROM `res.country.state`)")
    fun CheckTables(): Boolean
}