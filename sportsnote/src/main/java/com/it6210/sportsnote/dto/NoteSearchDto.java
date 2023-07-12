package com.it6210.sportsnote.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteSearchDto {

    /** ユーザID */
    private String userID;

    /** 検索ワード */
    private String searchWord;

}
