package com.example.busschedule.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Route::class] , version = 1 , exportSchema = false )
abstract  class  RouteDatabase : RoomDatabase()   {
    abstract fun  routeDao()  : RouteDao
    companion object{
        @Volatile
        private var  instance  : RouteDatabase?  =  null
        fun getDatabase (context: Context) :
                RouteDatabase {
            return instance ?:  synchronized(this){
             Room.databaseBuilder(
                   context, RouteDatabase::class.java , "route_database"
               )
                 .fallbackToDestructiveMigration()
                   .build()
                   .also { instance = it  }
            }
        }
    }


}