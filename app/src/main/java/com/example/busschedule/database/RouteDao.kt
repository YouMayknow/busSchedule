package com.example.busschedule.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.busschedule.database.Route
import kotlinx.coroutines.flow.Flow


@Dao
interface RouteDao {
    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun updateRoute(route: Route)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertRoute(route: Route)

    @Query("SELECT * FROM Route ORDER BY arrivalTime DESC ")
    fun getAllRoutes() : Flow<List<Route>>

    @Query("SELECT * FROM Route WHERE id = :id ")
    fun getRoute(id : Int ) : Flow<Route>
}