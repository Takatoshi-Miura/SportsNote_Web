package com.it6210.sportsnote.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupDto extends AbstractDto {

    /** グループID */
    private String groupID;

    /** タイトル */
    private String title;

    /** カラー */
    private Integer color;

    /** 並び順 */
    private Integer order;

}
