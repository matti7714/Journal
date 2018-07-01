package com.matti.journal.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by MATTI OPEYEMI on 01/07/2018.
 */

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDAO noteDAO();
    public
}
