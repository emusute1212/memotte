package io.github.emusute1212.memotte.android.data.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.threeten.bp.ZonedDateTime

@Entity(tableName = "memos")
data class MemoLocalDbEntity(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "content")
    val content: String,
    @ColumnInfo(name = "create_on")
    val createOn: ZonedDateTime,
)