package io.github.emusute1212.memotte.android.data.databases;

import java.lang.System;

@androidx.room.TypeConverters(value = {io.github.emusute1212.memotte.android.data.databases.converter.ZonedDateTimeConverter.class})
@androidx.room.Database(entities = {io.github.emusute1212.memotte.android.data.domain.MemoLocalDbEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lio/github/emusute1212/memotte/android/data/databases/MemoDatabase;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lio/github/emusute1212/memotte/android/data/databases/dao/MemoDao;", "android_debug"})
public abstract class MemoDatabase extends androidx.room.RoomDatabase {
    
    public MemoDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.github.emusute1212.memotte.android.data.databases.dao.MemoDao userDao();
}