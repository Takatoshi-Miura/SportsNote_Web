package com.it6210.sportsnote.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskSearchDto {

    /** ユーザID */
    private String userID;

    /** 完了フラグ */
    private Boolean completeFlg;

}
