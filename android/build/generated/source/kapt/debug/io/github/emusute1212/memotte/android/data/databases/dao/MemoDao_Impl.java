package io.github.emusute1212.memotte.android.data.databases.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.github.emusute1212.memotte.android.data.databases.converter.ZonedDateTimeConverter;
import io.github.emusute1212.memotte.android.data.domain.MemoLocalDbEntity;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.threeten.bp.ZonedDateTime;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MemoDao_Impl implements MemoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MemoLocalDbEntity> __insertionAdapterOfMemoLocalDbEntity;

  private final ZonedDateTimeConverter __zonedDateTimeConverter = new ZonedDateTimeConverter();

  private final EntityDeletionOrUpdateAdapter<MemoLocalDbEntity> __updateAdapterOfMemoLocalDbEntity;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public MemoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMemoLocalDbEntity = new EntityInsertionAdapter<MemoLocalDbEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `memos` (`id`,`content`,`create_on`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MemoLocalDbEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getContent() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContent());
        }
        final String _tmp;
        _tmp = __zonedDateTimeConverter.toZonedDateTime(value.getCreateOn());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
      }
    };
    this.__updateAdapterOfMemoLocalDbEntity = new EntityDeletionOrUpdateAdapter<MemoLocalDbEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `memos` SET `id` = ?,`content` = ?,`create_on` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MemoLocalDbEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getContent() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContent());
        }
        final String _tmp;
        _tmp = __zonedDateTimeConverter.toZonedDateTime(value.getCreateOn());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM memos WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final MemoLocalDbEntity memo, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMemoLocalDbEntity.insert(memo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final MemoLocalDbEntity memo, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfMemoLocalDbEntity.handle(memo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final int id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<MemoLocalDbEntity>> getAll() {
    final String _sql = "SELECT * FROM memos";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"memos"}, new Callable<List<MemoLocalDbEntity>>() {
      @Override
      public List<MemoLocalDbEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfCreateOn = CursorUtil.getColumnIndexOrThrow(_cursor, "create_on");
          final List<MemoLocalDbEntity> _result = new ArrayList<MemoLocalDbEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MemoLocalDbEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpContent;
            _tmpContent = _cursor.getString(_cursorIndexOfContent);
            final ZonedDateTime _tmpCreateOn;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfCreateOn);
            _tmpCreateOn = __zonedDateTimeConverter.fromZonedDateTime(_tmp);
            _item = new MemoLocalDbEntity(_tmpId,_tmpContent,_tmpCreateOn);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
