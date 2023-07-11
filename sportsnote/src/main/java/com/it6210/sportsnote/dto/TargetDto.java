package com.it6210.sportsnote.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TargetDto extends AbstractDto {

    /** 目標ID */
    private String targetID;

    /** タイトル */
    private String title;

    /** 年 */
    private Integer year;

    /** 月 */
    private Integer month;

    /** 年間目標フラグ */
    private Boolean isYearlyTarget;

}
