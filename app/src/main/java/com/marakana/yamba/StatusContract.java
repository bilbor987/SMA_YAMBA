package com.marakana.yamba;

import android.net.Uri;
import android.provider.BaseColumns;

class StatusContract {

    static final String DB_NAME = "timeline.db";
    static final int DB_VERSION = 1;
    static final String TABLE = "status";

    // Provider specific constants
    // content://com.marakana.yamba.StatusProvider/status
    public static final String AUTHORITY = "com.marakana.yamba.StatusProvider";

    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + TABLE);
    public static final int STATUS_ITEM = 1;
    public static final int STATUS_DIR = 2;
    public static final String STATUS_TYPE_ITEM = "vnd.android.cursor.item/vnd.com.marakana.yamba.provider.status";
    public static final String STATUS_TYPE_DIR = "vnd.android.cursor.dir/vnd.com.marakana.yamba.provider.status";

    static final String DEFAULT_SORT = Column.CREATED_AT + " DESC";

    class Column {
        static final String ID = BaseColumns._ID;
        static final String USER = "user";
        static final String MESSAGE = "message";
        static final String CREATED_AT = "created_at";
    }

}
