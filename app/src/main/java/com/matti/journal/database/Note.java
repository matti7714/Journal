package com.matti.journal.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by MATTI OPEYEMI on 01/07/2018.
 */

@Entity(tableName = "notes", foreignKeys = @ForeignKey(
    entity = User.class,
    parentColumns = "id",
    childColumns = "user_id"
))
public class Note {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "user_id")
    public int UserId;

    public String title;
    public String body;

    @ColumnInfo(name = "created_at")
    public Date createdAt;

    @ColumnInfo(name = "updated_at")
    public Date UpdatedAt;
}
