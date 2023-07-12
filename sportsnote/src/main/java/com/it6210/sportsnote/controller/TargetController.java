package com.it6210.sportsnote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.it6210.sportsnote.dto.TargetDto;
import com.it6210.sportsnote.dto.TargetSearchDto;
import com.it6210.sportsnote.service.TargetService;

/**
 * 目標一覧、新規作成、更新画面のController
 */
@Controller
@RequestMapping(value = "/target", method = { RequestMethod.GET, RequestMethod.POST })
public class TargetController {

    @Autowired
    TargetService targetService;

    /**
     * 目標一覧 初期表示
     * 
     * @param targetSearchDto
     * @param model
     * @return
     */
    @GetMapping("")
    public String index(TargetSearchDto targetSearchDto, Model model) {
        return search(targetSearchDto, model);
    }

    /**
     * 目標一覧 検索
     * 
     * @param targetSearchDto
     * @param model
     * @return
     */
    @PostMapping("/search")
    public String search(TargetSearchDto targetSearchDto, Model model) {
        List<TargetDto> targetDtoList = targetService.findTargetDto(targetSearchDto);
        return showTargetList(targetDtoList, targetSearchDto, model);
    }

    /**
     * 目標一覧 画面表示
     * 
     * @param targetDtoList
     * @param targetSearchDto
     * @param model
     * @return
     */
    private String showTargetList(List<TargetDto> targetDtoList, TargetSearchDto targetSearchDto, Model model) {
        model.addAttribute("targetDtoList", targetDtoList);
        model.addAttribute("targetSearchDto", targetSearchDto);
        return "user/target/index";
    }

    /**
     * 目標新規作成 初期表示
     * 
     * @param model
     * @return
     */
    @PostMapping("/new")
    public String targetNew(Model model) {
        TargetDto targetDto = new TargetDto();
        return showTargetNew(targetDto, false, model);
    }

    /**
     * 目標新規作成 保存
     * 
     * @param targetDto
     * @param model
     * @return
     */
    @PostMapping("/new/save")
    public String targetNewSave(TargetDto targetDto, Model model) {
        // バリデーションチェック
        Boolean hasError = targetService.validateProperty(targetDto);
        if (hasError) {
            return showTargetNew(targetDto, false, model);
        }

        // 保存
        targetService.insertTarget(targetDto);

        return "redirect:/target";
    }

    /**
     * 目標更新 初期表示
     * 
     * @param model
     * @return
     */
    @PostMapping("/update")
    public String targetUpdate(Model model) {
        TargetDto targetDto = new TargetDto();
        return showTargetNew(targetDto, true, model);
    }

    /**
     * 目標更新 更新
     * 
     * @param targetDto
     * @param model
     * @return
     */
    @PostMapping("/update/save")
    public String targetUpdateSave(TargetDto targetDto, Model model) {
        // バリデーションチェック
        Boolean hasError = targetService.validateProperty(targetDto);
        if (hasError) {
            return showTargetNew(targetDto, true, model);
        }

        // 更新
        targetService.updateTarget(targetDto);

        return "redirect:/target";
    }

    /**
     * 目標新規作成・更新 画面表示
     * 
     * @param targetDto
     * @param updateFlg
     * @param model
     * @return
     */
    private String showTargetNew(TargetDto targetDto, Boolean updateFlg, Model model) {
        String titleName = updateFlg ? "" : "";
        String registerButtonName = updateFlg ? "" : "";
        model.addAttribute("targetDto", targetDto);
        model.addAttribute("updateFlg", updateFlg);
        model.addAttribute("titleName", titleName);
        model.addAttribute("registerButtonName", registerButtonName);
        return "user/target/new";
    }

}
