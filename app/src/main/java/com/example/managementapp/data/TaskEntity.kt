package com.example.managementapp.data
import androidx.room.Entity
import androidx.room.PrimaryKey

//Memberitahu room bahwa class ini adalah table
@Entity(tableName = "table_tasks")

class TaskEntity (
    //menambahkan primary key
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    //kolom tabel
    val mapel: String ,
    val judulTugas: String ,
    val deskripsi: String ,
    val setTime: Int

    )