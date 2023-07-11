package com.it6210.sportsnote.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDto extends AbstractDto {

    /** 課題ID */
    private String taskID;

    /** 所属グループID */
    private Integer groupID;

    /** タイトル */
    private String title;

    /** 原因 */
    private String cause;

    /** 並び順 */
    private Integer order;

    /** 完了フラグ */
    private Boolean isComplete;

}
