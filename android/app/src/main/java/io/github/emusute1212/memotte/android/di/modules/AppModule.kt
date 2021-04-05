package io.github.emusute1212.memotte.android.di.modules

import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.emusute1212.memotte.android.MemotteApplication
import io.github.emusute1212.memotte.android.data.databases.MemoDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideDatabase(app: MemotteApplication): MemoDatabase {
        return Room.databaseBuilder(
            app.applicationContext,
            MemoDatabase::class.java,
            "memo_database.db"
        ).build()
    }
}