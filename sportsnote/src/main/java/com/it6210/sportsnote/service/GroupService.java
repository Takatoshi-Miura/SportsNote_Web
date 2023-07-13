package com.it6210.sportsnote.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.it6210.sportsnote.dto.GroupDto;
import com.it6210.sportsnote.entity.Group;

@Service
public class GroupService extends AbstractService<Group> {

    /**
     * グループを検索
     * 
     * @param groupSearchDto
     * @return
     */
    public List<GroupDto> findGroupDto() {
        List<GroupDto> groupDtoList = new ArrayList<GroupDto>();

        // TODO: FirebaseからGroupを取得

        return groupDtoList;
    }

    /**
     * グループを新規作成
     * 
     * @param groupDto
     */
    public void insertGroup(GroupDto groupDto) {
        // TODO: FirebaseにGroupを保存
    }

    /**
     * グループを更新
     * 
     * @param groupDto
     */
    public void updateGroup(GroupDto groupDto) {
        // TODO: FirebaseにGroupを保存
    }

    /**
     * グループのバリデーションチェック
     * 
     * @param groupDto
     * @return
     */
    public Boolean validateProperty(GroupDto groupDto) {
        Boolean hasError = false;

        // TODO: バリデーションチェック（エラータイプをセット）

        return hasError;
    }

}
