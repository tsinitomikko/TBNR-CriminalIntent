package com.bignerdranch.android.criminalintent.database

import androidx.room.RoomDatabase
import androidx.room.TypeConverters

//@Database(entities = [Crime::class], version = 1, exportSchema = false)
@TypeConverters(CrimeTypeConverters::class)
abstract class CrimeDatabase : RoomDatabase() {
    abstract fun crimeDao(): CrimeDao
}