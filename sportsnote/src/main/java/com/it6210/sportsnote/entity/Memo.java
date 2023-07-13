package com.it6210.sportsnote.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Memo extends AbstractEntity {

    /** メモID */
    private String memoID;

    /** 所属対策ID */
    private String measuresID;

    /** 所属ノートID */
    private String noteID;

    /** 内容 */
    private String detail;

}
