package com.accp.biz.lc;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lc.lcserviceMapper;
import com.accp.vo.lc.lcserviceVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class lcserviceBiz {
	
	@Autowired
	private lcserviceMapper dao;
	
	//首页统计维修台数
	public lcserviceVo queryall(String paymenttirm){
		return dao.querybycount(paymenttirm);
	}
	public lcserviceVo queryallbyxianjin(String paymenttirm){
		return dao.queryxianjin(paymenttirm);
	}
	
	public lcserviceVo queryallzaixiu(String wstatdate){
		return dao.queryzaixiutaici(wstatdate);
	}
	
	
}
