package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 用户
 *
 * @author 
 * @email
 * @date 2021-02-25
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YonghuEntity() {

	}

	public YonghuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 姓名
     */
    @TableField(value = "name")

    private String name;


    /**
     * 手机号
     */
    @TableField(value = "phone")

    private String phone;


    /**
     * 职务
     */
    @TableField(value = "zhiwu_types")

    private Integer zhiwuTypes;


    /**
     * 职称
     */
    @TableField(value = "zhicheng_types")

    private Integer zhichengTypes;


    /**
     * 身份证号
     */
    @TableField(value = "id_number")

    private String idNumber;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 照片
     */
    @TableField(value = "my_photo")

    private String myPhoto;


    /**
     * 民族
     */
    @TableField(value = "nation")

    private String nation;


    /**
     * 政治面貌
     */
    @TableField(value = "politics_types")

    private Integer politicsTypes;


    /**
     * 居住地
     */
    @TableField(value = "residence")

    private String residence;


    /**
     * 籍贯(身份证上地址)
     */
    @TableField(value = "birthplace")

    private String birthplace;


    /**
     * 婚姻状况
     */
    @TableField(value = "marriage_types")

    private Integer marriageTypes;


    /**
     * 学历
     */
    @TableField(value = "education_types")

    private Integer educationTypes;


    /**
     * 毕业学校
     */
    @TableField(value = "school")

    private String school;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：姓名
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：姓名
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：手机号
	 */
    public String getPhone() {
        return phone;
    }


    /**
	 * 获取：手机号
	 */

    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
	 * 设置：职务
	 */
    public Integer getZhiwuTypes() {
        return zhiwuTypes;
    }


    /**
	 * 获取：职务
	 */

    public void setZhiwuTypes(Integer zhiwuTypes) {
        this.zhiwuTypes = zhiwuTypes;
    }
    /**
	 * 设置：职称
	 */
    public Integer getZhichengTypes() {
        return zhichengTypes;
    }


    /**
	 * 获取：职称
	 */

    public void setZhichengTypes(Integer zhichengTypes) {
        this.zhichengTypes = zhichengTypes;
    }
    /**
	 * 设置：身份证号
	 */
    public String getIdNumber() {
        return idNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：照片
	 */
    public String getMyPhoto() {
        return myPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setMyPhoto(String myPhoto) {
        this.myPhoto = myPhoto;
    }
    /**
	 * 设置：民族
	 */
    public String getNation() {
        return nation;
    }


    /**
	 * 获取：民族
	 */

    public void setNation(String nation) {
        this.nation = nation;
    }
    /**
	 * 设置：政治面貌
	 */
    public Integer getPoliticsTypes() {
        return politicsTypes;
    }


    /**
	 * 获取：政治面貌
	 */

    public void setPoliticsTypes(Integer politicsTypes) {
        this.politicsTypes = politicsTypes;
    }
    /**
	 * 设置：居住地
	 */
    public String getResidence() {
        return residence;
    }


    /**
	 * 获取：居住地
	 */

    public void setResidence(String residence) {
        this.residence = residence;
    }
    /**
	 * 设置：籍贯(身份证上地址)
	 */
    public String getBirthplace() {
        return birthplace;
    }


    /**
	 * 获取：籍贯(身份证上地址)
	 */

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
    /**
	 * 设置：婚姻状况
	 */
    public Integer getMarriageTypes() {
        return marriageTypes;
    }


    /**
	 * 获取：婚姻状况
	 */

    public void setMarriageTypes(Integer marriageTypes) {
        this.marriageTypes = marriageTypes;
    }
    /**
	 * 设置：学历
	 */
    public Integer getEducationTypes() {
        return educationTypes;
    }


    /**
	 * 获取：学历
	 */

    public void setEducationTypes(Integer educationTypes) {
        this.educationTypes = educationTypes;
    }
    /**
	 * 设置：毕业学校
	 */
    public String getSchool() {
        return school;
    }


    /**
	 * 获取：毕业学校
	 */

    public void setSchool(String school) {
        this.school = school;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yonghu{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", name=" + name +
            ", phone=" + phone +
            ", zhiwuTypes=" + zhiwuTypes +
            ", zhichengTypes=" + zhichengTypes +
            ", idNumber=" + idNumber +
            ", sexTypes=" + sexTypes +
            ", myPhoto=" + myPhoto +
            ", nation=" + nation +
            ", politicsTypes=" + politicsTypes +
            ", residence=" + residence +
            ", birthplace=" + birthplace +
            ", marriageTypes=" + marriageTypes +
            ", educationTypes=" + educationTypes +
            ", school=" + school +
            ", createTime=" + createTime +
        "}";
    }
}
