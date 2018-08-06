package com.xl.backen.dao;

import com.xl.backen.entity.ParentMenus;
import com.xl.backen.entity.Powers;

import com.xl.backen.entity.RolesPower;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PowersMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(Powers record);

    int insertSelective(Powers record);

    Powers selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(Powers record);

    int updateByPrimaryKey(Powers record);
    
    List<Powers> queryAll(Integer type);

    List<Powers> queryByRoleId(String roleId);

    List<ParentMenus> queryParentMenusByRoleId(String roleId);
}