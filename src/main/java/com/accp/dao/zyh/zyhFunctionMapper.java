package com.accp.dao.zyh;

import com.accp.pojo.Function;

public interface zyhFunctionMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
}