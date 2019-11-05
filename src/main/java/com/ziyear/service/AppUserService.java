package com.ziyear.service;

import com.ziyear.model.AppUserDTO;

import java.util.List;

public interface AppUserService {

    int saveUser(AppUserDTO AppUserDTO);

    List<AppUserDTO> queryAllUser();
}
