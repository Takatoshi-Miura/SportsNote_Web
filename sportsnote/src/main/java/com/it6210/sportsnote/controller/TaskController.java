package com.it6210.sportsnote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.it6210.sportsnote.dto.TaskDto;
import com.it6210.sportsnote.dto.TaskSearchDto;
import com.it6210.sportsnote.service.TaskService;

/**
 * 課題一覧、新規作成、更新画面のController
 */
@Controller
@RequestMapping(value = "/task", method = { RequestMethod.GET, RequestMethod.POST })
public class TaskController {

    @Autowired
    TaskService taskService;

    /**
     * 課題一覧 初期表示
     * 
     * @param taskSearchDto
     * @param model
     * @return
     */
    @GetMapping("")
    public String index(TaskSearchDto taskSearchDto, Model model) {
        return search(taskSearchDto, model);
    }

    /**
     * 課題一覧 検索
     * 
     * @param taskSearchDto
     * @param model
     * @return
     */
    @PostMapping("/search")
    public String search(TaskSearchDto taskSearchDto, Model model) {
        List<TaskDto> taskDtoList = taskService.findTaskDto(taskSearchDto);
        return showTaskList(taskDtoList, taskSearchDto, model);
    }

    /**
     * 課題一覧 画面表示
     * 
     * @param taskDtoList
     * @param taskSearchDto
     * @param model
     * @return
     */
    private String showTaskList(List<TaskDto> taskDtoList, TaskSearchDto taskSearchDto, Model model) {
        model.addAttribute("taskDtoList", taskDtoList);
        model.addAttribute("taskSearchDto", taskSearchDto);
        return "user/task/index";
    }

    /**
     * 課題新規作成 初期表示
     * 
     * @param model
     * @return
     */
    @PostMapping("/new")
    public String taskNew(Model model) {
        TaskDto taskDto = new TaskDto();
        return showTaskNew(taskDto, false, model);
    }

    /**
     * 課題新規作成 保存
     * 
     * @param taskDto
     * @param model
     * @return
     */
    @PostMapping("/new/save")
    public String taskNewSave(TaskDto taskDto, Model model) {
        // バリデーションチェック
        Boolean hasError = taskService.validateProperty(taskDto);
        if (hasError) {
            return showTaskNew(taskDto, false, model);
        }

        // 保存
        taskService.insertTask(taskDto);

        return "redirect:/task";
    }

    /**
     * 課題更新 初期表示
     * 
     * @param model
     * @return
     */
    @PostMapping("/update")
    public String taskUpdate(Model model) {
        TaskDto taskDto = new TaskDto();
        return showTaskNew(taskDto, true, model);
    }

    /**
     * 課題更新 更新
     * 
     * @param taskDto
     * @param model
     * @return
     */
    @PostMapping("/update/save")
    public String taskUpdateSave(TaskDto taskDto, Model model) {
        // バリデーションチェック
        Boolean hasError = taskService.validateProperty(taskDto);
        if (hasError) {
            return showTaskNew(taskDto, true, model);
        }

        // 更新
        taskService.updateTask(taskDto);

        return "redirect:/task";
    }

    /**
     * 課題新規作成・更新 画面表示
     * 
     * @param taskDto
     * @param updateFlg
     * @param model
     * @return
     */
    private String showTaskNew(TaskDto taskDto, Boolean updateFlg, Model model) {
        String titleName = updateFlg ? "" : "";
        String registerButtonName = updateFlg ? "" : "";
        model.addAttribute("taskDto", taskDto);
        model.addAttribute("updateFlg", updateFlg);
        model.addAttribute("titleName", titleName);
        model.addAttribute("registerButtonName", registerButtonName);
        return "user/task/new";
    }

}
