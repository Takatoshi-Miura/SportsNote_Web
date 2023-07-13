package com.it6210.sportsnote.common;

import java.sql.Timestamp;

public class DateUtil {

    /**
     * 現在日時を取得
     * 
     * @return 現在日時
     */
    public static Timestamp getCurrentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }

}
