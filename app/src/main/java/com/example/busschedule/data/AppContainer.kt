package com.example.busschedule.data

import android.content.Context
import androidx.room.RoomDatabase
import com.example.busschedule.database.RouteDao
import com.example.busschedule.database.RouteDatabase
import com.example.busschedule.repository.OfflineRouteRepository
import com.example.busschedule.repository.RouteRepository

interface  AppContainer  {
    val routeRepository : RouteRepository
}

class DefaultAppContainer(private  val context: Context) : AppContainer {
    override val routeRepository: RouteRepository by lazy {
        OfflineRouteRepository(routeDao = RouteDatabase.getDatabase(context).routeDao())
    }
}