package com.ziyear.mapper;

import com.ziyear.model.AppUserDTO;
import com.ziyear.model.AppUserDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppUserDTOMapper {
    int countByExample(AppUserDTOExample example);

    int deleteByExample(AppUserDTOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppUserDTO record);

    int insertSelective(AppUserDTO record);

    List<AppUserDTO> selectByExample(AppUserDTOExample example);

    AppUserDTO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppUserDTO record, @Param("example") AppUserDTOExample example);

    int updateByExample(@Param("record") AppUserDTO record, @Param("example") AppUserDTOExample example);

    int updateByPrimaryKeySelective(AppUserDTO record);

    int updateByPrimaryKey(AppUserDTO record);
}