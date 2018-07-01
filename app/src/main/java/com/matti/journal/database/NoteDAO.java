package com.matti.journal.database;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by MATTI OPEYEMI on 01/07/2018.
 */

public interface NoteDAO {
    @Insert
    public void createNote(Note note);

    @Update
    public void updateNote(Note note);

    @Delete
    public void deleteNote(Note note);

    @Query("SELECT * FROM notes WHERE user_id = :userId")
    public List<Note> fetchUserNotes(int userId);
}
