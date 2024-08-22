package com.example.busschedule.repository

import com.example.busschedule.database.Route
import kotlinx.coroutines.flow.Flow

interface  RouteRepository  {
   suspend fun insertRoute(route : Route)
    suspend fun updateRoute(route: Route)
    suspend fun getAllRoutes() : Flow<List<Route>>
    suspend   fun getRoute(id : Int ) : Flow<Route>
}

