package com.accp.biz.cqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.cqq.*;
import com.accp.dao.cqq.CqqSupplierDao;
import com.accp.pojo.Supplier;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@org.springframework.stereotype.Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CqqSupplierBiz {

	@Autowired
	private CqqSupplierDao cqqSupplierDao;// 供货商

	@Autowired
	private CqqGoodsDao cqqGoodsDao;// 商品

	
	@Autowired
	private CqqServiceDao dao;
	/**
	 * 供货单位查询
	 * 
	 * @param n
	 * @param s
	 * @return
	 */
	public PageInfo<Supplier> selectSupplierList(Integer n, Integer s, String name) {
		PageHelper.startPage(n, s);
		QueryWrapper<Supplier> qw = Wrappers.query();
		qw.like("ghsname", "null".equals(name) ? "" : name);
		return new PageInfo<Supplier>(cqqSupplierDao.selectList(qw));
	}

	/**
	 * 供货单位删除
	 * 
	 * @param id
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int supplierDelete(Integer id) {
		System.out.println(dao.selectGoods(id));
		if(dao.selectGoods(id)!=0) {
			return 0;
		}
		return cqqSupplierDao.deleteById(id);
	}

	/**
	 * 供货单位修改
	 * 
	 * @param supplier
	 * @return
	 */
	public int supplierUpdate(Supplier supplier) {
		return cqqSupplierDao.updateById(supplier);
	}

	/**
	 * 供货单位添加
	 * 
	 * @param supplier
	 * @return
	 */
	public int supplierAdd(Supplier supplier) {
		return cqqSupplierDao.insert(supplier);
	}

	/**
	 * 供货单位查询
	 * 
	 * @param id
	 * @return
	 */
	public Supplier selectSupplierPojo(Integer id) {
		return cqqSupplierDao.selectById(id);
	}

}
