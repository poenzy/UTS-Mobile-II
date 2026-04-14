package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {
    @Insert
    suspend fun insert(word: SaveWord)

    @Query("SELECT * FROM history_word ORDER BY timestamp DESC")
    fun getAllSavedword():
            Flow<List<SaveWord>>
}