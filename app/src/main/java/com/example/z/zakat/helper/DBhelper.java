package com.example.z.zakat.helper;

/**
 * Created by z on 04/12/17.
 */

public class DBhelper {
    private static final DBhelper ourInstance = new DBhelper();

    public static DBhelper getInstance() {
        return ourInstance;
    }

    private DBhelper() {
    }
}
