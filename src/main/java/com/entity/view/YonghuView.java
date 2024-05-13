package com.entity.view;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-02-25
 */
@TableName("yonghu")
public class YonghuView extends YonghuEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 职务的值
		*/
		private String zhiwuValue;
		/**
		* 职称的值
		*/
		private String zhichengValue;
		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 政治面貌的值
		*/
		private String politicsValue;
		/**
		* 婚姻状况的值
		*/
		private String marriageValue;
		/**
		* 学历的值
		*/
		private String educationValue;



	public YonghuView() {

	}

	public YonghuView(YonghuEntity yonghuEntity) {
		try {
			BeanUtils.copyProperties(this, yonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 职务的值
			*/
			public String getZhiwuValue() {
				return zhiwuValue;
			}
			/**
			* 设置： 职务的值
			*/
			public void setZhiwuValue(String zhiwuValue) {
				this.zhiwuValue = zhiwuValue;
			}
			/**
			* 获取： 职称的值
			*/
			public String getZhichengValue() {
				return zhichengValue;
			}
			/**
			* 设置： 职称的值
			*/
			public void setZhichengValue(String zhichengValue) {
				this.zhichengValue = zhichengValue;
			}
			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
			/**
			* 获取： 政治面貌的值
			*/
			public String getPoliticsValue() {
				return politicsValue;
			}
			/**
			* 设置： 政治面貌的值
			*/
			public void setPoliticsValue(String politicsValue) {
				this.politicsValue = politicsValue;
			}
			/**
			* 获取： 婚姻状况的值
			*/
			public String getMarriageValue() {
				return marriageValue;
			}
			/**
			* 设置： 婚姻状况的值
			*/
			public void setMarriageValue(String marriageValue) {
				this.marriageValue = marriageValue;
			}
			/**
			* 获取： 学历的值
			*/
			public String getEducationValue() {
				return educationValue;
			}
			/**
			* 设置： 学历的值
			*/
			public void setEducationValue(String educationValue) {
				this.educationValue = educationValue;
			}






}
