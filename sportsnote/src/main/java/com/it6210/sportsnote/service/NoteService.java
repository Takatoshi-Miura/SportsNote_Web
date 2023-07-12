package com.it6210.sportsnote.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.it6210.sportsnote.dto.NoteDto;
import com.it6210.sportsnote.dto.NoteSearchDto;

@Service
public class NoteService {

    /**
     * ノートを検索
     * 
     * @param noteSearchDto
     * @return
     */
    public List<NoteDto> findNoteDto(NoteSearchDto noteSearchDto) {
        List<NoteDto> noteDtoList = new ArrayList<NoteDto>();

        // TODO: FirebaseからNoteを取得

        return noteDtoList;
    }

    /**
     * ノートを新規作成
     * 
     * @param noteDto
     */
    public void insertNote(NoteDto noteDto) {
        // TODO: FirebaseにNoteを保存
    }

    /**
     * ノートを更新
     * 
     * @param noteDto
     */
    public void updateNote(NoteDto noteDto) {
        // TODO: FirebaseにNoteを保存
    }

    /**
     * ノートのバリデーションチェック
     * 
     * @param noteDto
     * @return
     */
    public Boolean validateProperty(NoteDto noteDto) {
        Boolean hasError = false;

        // TODO: バリデーションチェック（エラータイプをセット）

        return hasError;
    }
}
