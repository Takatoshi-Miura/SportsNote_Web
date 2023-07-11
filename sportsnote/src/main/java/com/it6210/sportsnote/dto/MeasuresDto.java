package com.it6210.sportsnote.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MeasuresDto extends AbstractDto {

    /** 対策ID */
    private String measuresID;

    /** 所属課題ID */
    private String taskID;

    /** タイトル */
    private String title;

    /** 並び順 */
    private Integer order;
    
}
