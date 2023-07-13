package com.it6210.sportsnote.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.it6210.sportsnote.dto.TargetDto;
import com.it6210.sportsnote.dto.TargetSearchDto;
import com.it6210.sportsnote.entity.Target;

@Service
public class TargetService extends AbstractService<Target> {

    /**
     * 目標を検索
     * 
     * @param targetSearchDto
     * @return
     */
    public List<TargetDto> findTargetDto(TargetSearchDto targetSearchDto) {
        List<TargetDto> targetDtoList = new ArrayList<TargetDto>();

        // TODO: FirebaseからTargetを取得

        return targetDtoList;
    }

    /**
     * 目標を新規作成
     * 
     * @param targetDto
     */
    public void insertTarget(TargetDto targetDto) {
        // TODO: FirebaseにTargetを保存
    }

    /**
     * 目標を更新
     * 
     * @param targetDto
     */
    public void updateTarget(TargetDto targetDto) {
        // TODO: FirebaseにTargetを保存
    }

    /**
     * 目標のバリデーションチェック
     * 
     * @param targetDto
     * @return
     */
    public Boolean validateProperty(TargetDto targetDto) {
        Boolean hasError = false;

        // TODO: バリデーションチェック（エラータイプをセット）

        return hasError;
    }

}
