package com.example.unscramble.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [SaveWord::class], version = 1)
abstract class AppDatabase :
RoomDatabase(){
    abstract fun wordDao(): WordDao
}