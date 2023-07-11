package com.it6210.sportsnote.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AbstractDto {

    /** ユーザID */
    private String userID;

    /** 削除フラグ */
    private Boolean isDeleted;

    /** 作成日 */
    private Timestamp createrd_at;

    /** 更新日 */
    private Timestamp updated_at;

}
