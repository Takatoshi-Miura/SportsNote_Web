package com.it6210.sportsnote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.it6210.sportsnote.dto.GroupDto;
import com.it6210.sportsnote.service.GroupService;

/**
 * グループ新規作成、更新画面のController
 */
@Controller
@RequestMapping(value = "/group", method = { RequestMethod.GET, RequestMethod.POST })
public class GroupController {

    @Autowired
    GroupService groupService;

    /**
     * グループ新規作成 初期表示
     * 
     * @param model
     * @return
     */
    @PostMapping("/new")
    public String groupNew(Model model) {
        GroupDto groupDto = new GroupDto();
        return showGroupNew(groupDto, false, model);
    }

    /**
     * グループ新規作成 保存
     * 
     * @param GroupDto
     * @param model
     * @return
     */
    @PostMapping("/new/save")
    public String groupNewSave(GroupDto groupDto, Model model) {
        // バリデーションチェック
        Boolean hasError = groupService.validateProperty(groupDto);
        if (hasError) {
            return showGroupNew(groupDto, false, model);
        }

        // 保存
        groupService.insertGroup(groupDto);

        return "redirect:/group";
    }

    /**
     * グループ更新 初期表示
     * 
     * @param model
     * @return
     */
    @PostMapping("/update")
    public String groupUpdate(Model model) {
        GroupDto groupDto = new GroupDto();
        return showGroupNew(groupDto, true, model);
    }

    /**
     * グループ更新 更新
     * 
     * @param GroupDto
     * @param model
     * @return
     */
    @PostMapping("/update/save")
    public String groupUpdateSave(GroupDto groupDto, Model model) {
        // バリデーションチェック
        Boolean hasError = groupService.validateProperty(groupDto);
        if (hasError) {
            return showGroupNew(groupDto, true, model);
        }

        // 更新
        groupService.updateGroup(groupDto);

        return "redirect:/Group";
    }

    /**
     * グループ新規作成・更新 画面表示
     * 
     * @param groupDto
     * @param updateFlg
     * @param model
     * @return
     */
    private String showGroupNew(GroupDto groupDto, Boolean updateFlg, Model model) {
        String titleName = updateFlg ? "" : "";
        String registerButtonName = updateFlg ? "" : "";
        model.addAttribute("groupDto", groupDto);
        model.addAttribute("updateFlg", updateFlg);
        model.addAttribute("titleName", titleName);
        model.addAttribute("registerButtonName", registerButtonName);
        return "user/group/new";
    }

}
