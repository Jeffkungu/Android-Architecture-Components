package com.anushka.androidtutz.contactmanager.db.entity;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Contact.class}, version = 1)
public abstract class ContactsAppDatabse extends RoomDatabase {

    public abstract ContactDAO getContactDAO();
}
