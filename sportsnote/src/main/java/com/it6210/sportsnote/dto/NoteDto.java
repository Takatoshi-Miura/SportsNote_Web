package com.it6210.sportsnote.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteDto extends AbstractDto {

    /** ノートID */
    private String noteId;

    /** 種別（0:フリー、1:練習、2:大会） */
    private Integer noteType;

    /** タイトル */
    private String title;

    /** 日付 */
    private Timestamp date;

    /** 天気（0:晴れ、1:くもり、2:雨） */
    private Integer weather;

    /** 気温 */
    private Integer temperature;

    /** 体調 */
    private String condition;

    /** 反省 */
    private String reflection;

    /** 練習目的 */
    private String purpose;

    /** 練習内容 */
    private String detail;

    /** 目的 */
    private String target;

    /** 意識すること */
    private String consciousness;

    /** 結果 */
    private String result;

}
