package com.ziyear.controller;

import com.ziyear.common.response.ActionResult;
import com.ziyear.model.AppUserDTO;
import com.ziyear.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class AppUserController {
    @Autowired
    private AppUserService appUserService;

    @RequestMapping("/save")
    public ActionResult saveUser(@RequestBody AppUserDTO AppUserDTO) {
        appUserService.saveUser(AppUserDTO);
        return ActionResult.getSuccessResult();
    }

    @RequestMapping("/query")
    public ActionResult queryUser() {
        List<AppUserDTO> AppUserDTOS = appUserService.queryAllUser();
        return ActionResult.getSuccessResult(AppUserDTOS);
    }
}
