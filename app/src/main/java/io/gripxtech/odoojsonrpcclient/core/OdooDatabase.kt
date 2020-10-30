package io.gripxtech.odoojsonrpcclient.core

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import io.gripxtech.odoojsonrpcclient.App
import io.gripxtech.odoojsonrpcclient.core.persistence.AppTypeConverters
import io.gripxtech.odoojsonrpcclient.customer.entities.Customer
import io.gripxtech.odoojsonrpcclient.customer.entities.CustomerDao
import io.gripxtech.odoojsonrpcclient.instancias.entities.Dao_instancias
import io.gripxtech.odoojsonrpcclient.instancias.entities.instancias
import io.gripxtech.odoojsonrpcclient.territorial.entities.Dao_res_country_state
import io.gripxtech.odoojsonrpcclient.territorial.entities.res_country_state

@Database(
    entities = [
        /* Add Room Entities here: BEGIN */

        Customer::class, // res.partner
        res_country_state::class,
        instancias::class

        /* Add Room Entities here: END */
    ], version = 1, exportSchema = true
)
@TypeConverters(AppTypeConverters::class)
abstract class OdooDatabase : RoomDatabase() {

    companion object {

        lateinit var app: App

        var database: OdooDatabase? = null
            get() {
                if (field == null) {
                    field = Room.databaseBuilder(app, OdooDatabase::class.java, "${Odoo.user.androidName}.db").build()
                }
                return field
            }
    }

    /* Add Room DAO(s) here: BEGIN */

    abstract fun customerDao(): CustomerDao
    abstract fun DaoMethodsStates(): Dao_res_country_state
    abstract fun DaoMethodsInstances(): Dao_instancias

    /* Add Room DAO(s) here: END */
}
