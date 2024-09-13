package com.entity.vo;

import com.entity.XinliyishengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 心理医生信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-22 13:44:39
 */
public class XinliyishengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 心理医生姓名
	 */
	
	private String xinliyishengxingming;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 从业时间
	 */
	
	private String congyeshijian;
		
	/**
	 * 擅长领域
	 */
	
	private String shanzhanglingyu;
		
	/**
	 * 个人简介
	 */
	
	private String gerenjianjie;
				
	
	/**
	 * 设置：心理医生姓名
	 */
	 
	public void setXinliyishengxingming(String xinliyishengxingming) {
		this.xinliyishengxingming = xinliyishengxingming;
	}
	
	/**
	 * 获取：心理医生姓名
	 */
	public String getXinliyishengxingming() {
		return xinliyishengxingming;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：从业时间
	 */
	 
	public void setCongyeshijian(String congyeshijian) {
		this.congyeshijian = congyeshijian;
	}
	
	/**
	 * 获取：从业时间
	 */
	public String getCongyeshijian() {
		return congyeshijian;
	}
				
	
	/**
	 * 设置：擅长领域
	 */
	 
	public void setShanzhanglingyu(String shanzhanglingyu) {
		this.shanzhanglingyu = shanzhanglingyu;
	}
	
	/**
	 * 获取：擅长领域
	 */
	public String getShanzhanglingyu() {
		return shanzhanglingyu;
	}
				
	
	/**
	 * 设置：个人简介
	 */
	 
	public void setGerenjianjie(String gerenjianjie) {
		this.gerenjianjie = gerenjianjie;
	}
	
	/**
	 * 获取：个人简介
	 */
	public String getGerenjianjie() {
		return gerenjianjie;
	}
			
}