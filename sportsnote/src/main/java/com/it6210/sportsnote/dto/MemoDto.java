package com.it6210.sportsnote.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemoDto extends AbstractDto {

    /** メモID */
    private String memoID;

    /** 所属対策ID */
    private String measuresID;

    /** 所属ノートID */
    private String noteID;

    /** 内容 */
    private String detail;

}
