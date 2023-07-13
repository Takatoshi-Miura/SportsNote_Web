package com.it6210.sportsnote.service;

import org.springframework.transaction.annotation.Transactional;

import com.it6210.sportsnote.common.DateUtil;
import com.it6210.sportsnote.entity.AbstractEntity;

@Transactional
public abstract class AbstractService<ENTITY extends AbstractEntity> {

    /**
     * 登録日を設定
     * 
     * @param entity
     */
    protected void setInsertMetaInfo(ENTITY entity) {
        entity.setCreaterd_at(DateUtil.getCurrentTimestamp());
        setUpdateMetaInfo(entity);
    }

    /**
     * 更新日を設定
     * 
     * @param entity
     */
    protected void setUpdateMetaInfo(ENTITY entity) {
        entity.setUpdated_at(DateUtil.getCurrentTimestamp());
    }

}
