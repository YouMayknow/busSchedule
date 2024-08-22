package com.example.busschedule.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Route")
data class Route (
    @PrimaryKey(autoGenerate = true)
    val id : Int = 1 ,
    val stopName : String ,
    val arrivalTime : Int ,
)