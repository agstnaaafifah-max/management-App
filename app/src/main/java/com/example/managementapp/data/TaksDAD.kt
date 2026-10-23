package com.example.managementapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStestrategy
import androidx.room.Query
import androidx.room.Update
import androidx.coroutines.flow.Flow

@Dao
interface TaksDAD {
    //simpan data tugas baru ke DB
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(taskEntity: TaskEntity)

    //menampilkan data
    @Query(value = "SELECT * FROM table_tasks ORDER BY id ASC")
    fun getAllTaks():Flow<List<TaskEntity>>

    //mengupdate data tugas
    @Update
    suspend fun updateTaks(taks: TaskEntity)

    //menghapus data tugas
    @Delete
    suspend fun deletetaks(taks: TaskEntity)


class TaksDAD {
}