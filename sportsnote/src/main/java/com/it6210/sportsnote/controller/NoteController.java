package com.it6210.sportsnote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.it6210.sportsnote.dto.NoteDto;
import com.it6210.sportsnote.dto.NoteSearchDto;
import com.it6210.sportsnote.service.NoteService;

/**
 * ノート一覧、新規作成、更新画面のController
 */
@Controller
@RequestMapping(value = "/note", method = { RequestMethod.GET, RequestMethod.POST })
public class NoteController {

    @Autowired
    NoteService noteService;

    /**
     * ノート一覧 初期表示
     * 
     * @param noteSearchDto
     * @param model
     * @return
     */
    @GetMapping("")
    public String index(NoteSearchDto noteSearchDto, Model model) {
        return search(noteSearchDto, model);
    }

    /**
     * ノート一覧 検索
     * 
     * @param noteSearchDto
     * @param model
     * @return
     */
    @PostMapping("/search")
    public String search(NoteSearchDto noteSearchDto, Model model) {
        List<NoteDto> noteDtoList = noteService.findNoteDto(noteSearchDto);
        return showNoteList(noteDtoList, noteSearchDto, model);
    }

    /**
     * ノート一覧 画面表示
     * 
     * @param noteDtoList
     * @param noteSearchDto
     * @param model
     * @return
     */
    private String showNoteList(List<NoteDto> noteDtoList, NoteSearchDto noteSearchDto, Model model) {
        model.addAttribute("noteDtoList", noteDtoList);
        model.addAttribute("noteSearchDto", noteSearchDto);
        return "user/note/index";
    }

    /**
     * ノート新規作成 初期表示
     * 
     * @param model
     * @return
     */
    @PostMapping("/new")
    public String noteNew(Model model) {
        NoteDto noteDto = new NoteDto();
        return showNoteNew(noteDto, false, model);
    }

    /**
     * ノート新規作成 保存
     * 
     * @param noteDto
     * @param model
     * @return
     */
    @PostMapping("/new/save")
    public String noteNewSave(NoteDto noteDto, Model model) {
        // バリデーションチェック
        Boolean hasError = noteService.validateProperty(noteDto);
        if (hasError) {
            return showNoteNew(noteDto, false, model);
        }

        // 保存
        noteService.insertNote(noteDto);

        return "redirect:/note";
    }

    /**
     * ノート更新 初期表示
     * 
     * @param model
     * @return
     */
    @PostMapping("/update")
    public String noteUpdate(Model model) {
        NoteDto noteDto = new NoteDto();
        return showNoteNew(noteDto, true, model);
    }

    /**
     * ノート更新 更新
     * 
     * @param noteDto
     * @param model
     * @return
     */
    @PostMapping("/update/save")
    public String noteUpdateSave(NoteDto noteDto, Model model) {
        // バリデーションチェック
        Boolean hasError = noteService.validateProperty(noteDto);
        if (hasError) {
            return showNoteNew(noteDto, true, model);
        }

        // 更新
        noteService.updateNote(noteDto);

        return "redirect:/note";
    }

    /**
     * ノート新規作成・更新 画面表示
     * 
     * @param noteDto
     * @param updateFlg
     * @param model
     * @return
     */
    private String showNoteNew(NoteDto noteDto, Boolean updateFlg, Model model) {
        String titleName = updateFlg ? "" : "";
        String registerButtonName = updateFlg ? "" : "";
        model.addAttribute("noteDto", noteDto);
        model.addAttribute("updateFlg", updateFlg);
        model.addAttribute("titleName", titleName);
        model.addAttribute("registerButtonName", registerButtonName);
        return "user/note/new";
    }

}
