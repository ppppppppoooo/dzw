package com.accp.dao.zyh;

import com.accp.pojo.Supplier;

public interface zyhSupplierMapper {
    int deleteByPrimaryKey(Integer ghsid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer ghsid);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}