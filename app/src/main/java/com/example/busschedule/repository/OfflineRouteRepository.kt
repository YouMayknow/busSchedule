package com.example.busschedule.repository

import com.example.busschedule.database.Route
import com.example.busschedule.database.RouteDao
import kotlinx.coroutines.flow.Flow

class  OfflineRouteRepository(
    private  val routeDao: RouteDao
) : RouteRepository {
    override suspend  fun insertRoute(route: Route) = routeDao.insertRoute(route)

    override suspend  fun updateRoute(route: Route) = routeDao.updateRoute(route)

    override suspend fun getAllRoutes(): Flow<List<Route>> = routeDao.getAllRoutes()

    override  suspend fun getRoute(id: Int): Flow<Route> = routeDao.getRoute(id)
}