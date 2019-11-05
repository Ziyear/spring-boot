package com.ziyear.service.impl;

import com.ziyear.mapper.AppUserDTOMapper;
import com.ziyear.model.AppUserDTO;
import com.ziyear.model.AppUserDTOExample;
import com.ziyear.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private AppUserDTOMapper AppUserDTOMapper;


    @Override
    public int saveUser(AppUserDTO AppUserDTO) {
        return AppUserDTOMapper.insert(AppUserDTO);
    }

    @Override
    public List<AppUserDTO> queryAllUser() {
        AppUserDTOExample example = new AppUserDTOExample();
        example.createCriteria();
        return AppUserDTOMapper.selectByExample(example);
    }
}
