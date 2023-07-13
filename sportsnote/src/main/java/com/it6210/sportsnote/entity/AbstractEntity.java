package com.it6210.sportsnote.entity;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractEntity {

    /** ユーザID */
    private String userID;

    /** 削除フラグ */
    private Boolean isDeleted;

    /** 作成日 */
    private Timestamp createrd_at;

    /** 更新日 */
    private Timestamp updated_at;

}
