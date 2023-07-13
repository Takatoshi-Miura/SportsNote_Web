package com.it6210.sportsnote.common;

public interface Constants {
    
    /** DBエンティティで使用する定数 */
    interface DB {

        interface NOTE {

            /** ノート種別 */
            interface NOTE_TYPE {
                int FREE = 0;
                int PRACTICE = 1;
                int TOURNAMENT = 2;
            }

            /** 天気 */
            interface WEATHER {
                int SUNNY = 0;
                int CLOUDY = 1;
                int RAINY = 2;
            }
        }

    }

    /** エラー種別 */
    interface ERROR_TYPE {
        int EMPTY = 0;      // 未入力
        int INVALID = 1;    // 想定外の値
    }

}
