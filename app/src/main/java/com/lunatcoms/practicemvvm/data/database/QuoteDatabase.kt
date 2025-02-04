package com.lunatcoms.practicemvvm.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lunatcoms.practicemvvm.data.database.dao.QuoteDao
import com.lunatcoms.practicemvvm.data.database.entities.QuoteEntity

@Database(entities = [QuoteEntity::class], version = 1)
abstract class QuoteDatabase: RoomDatabase() {

    abstract fun getQuoteDao(): QuoteDao
}