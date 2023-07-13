package com.it6210.sportsnote.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Measures extends AbstractEntity {

    /** 対策ID */
    private String measuresID;

    /** 所属課題ID */
    private String taskID;

    /** タイトル */
    private String title;

    /** 並び順 */
    private Integer order;

}
