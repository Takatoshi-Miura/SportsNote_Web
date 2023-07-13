package com.it6210.sportsnote.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.it6210.sportsnote.dto.TaskDto;
import com.it6210.sportsnote.dto.TaskSearchDto;
import com.it6210.sportsnote.entity.Task;

@Service
public class TaskService extends AbstractService<Task> {

    /**
     * 課題を検索
     * 
     * @param taskSearchDto
     * @return
     */
    public List<TaskDto> findTaskDto(TaskSearchDto taskSearchDto) {
        List<TaskDto> taskDtoList = new ArrayList<TaskDto>();

        // TODO: FirebaseからTaskを取得

        return taskDtoList;
    }

    /**
     * 課題を新規作成
     * 
     * @param taskDto
     */
    public void insertTask(TaskDto taskDto) {
        // TODO: FirebaseにTaskを保存
    }

    /**
     * 課題を更新
     * 
     * @param taskDto
     */
    public void updateTask(TaskDto taskDto) {
        // TODO: FirebaseにTaskを保存
    }

    /**
     * 課題のバリデーションチェック
     * 
     * @param taskDto
     * @return
     */
    public Boolean validateProperty(TaskDto taskDto) {
        Boolean hasError = false;

        // TODO: バリデーションチェック（エラータイプをセット）

        return hasError;
    }

}
