package com.example.mydemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户基本信息表
 * </p>
 *
 * @author dengxz
 * @since 2020-04-15
 */
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID=1L;

      /**
     * 用户id
     */
        @TableId(value = "user_id", type = IdType.AUTO)
      private Long userId;

      /**
     * 用户名称
     */
      private String userName;

    private String userEnname;

      /**
     * Email
     */
      private String email;

      /**
     * 密码
     */
      private String password;

      /**
     * 性别[0男 1女]
     */
      private Integer sex;

      /**
     * 用户状态
     */
      private Integer status;

      /**
     * 电话
     */
      private String mobile;

      /**
     * QQ
     */
      private String qq;

      /**
     * 头像URL
     */
      private String avatar;

      /**
     * 公司ID
     */
      private Long companyId;

      /**
     * 用户上级ID
     */
      private Long superiorId;

      /**
     * 用户上级名称
     */
      private String superiorName;

      /**
     * 员工二维码
     */
      private String qrCode;

      /**
     * 职位
     */
      private String position;

      /**
     * 最后登录IP
     */
      private String lastLoginIp;

      /**
     * 最后登录时间
     */
      private LocalDateTime lastLoginDate;

      /**
     * 注册时间
     */
      private LocalDateTime regDate;

      /**
     * 用户类型[0普通用户 1管理员]
     */
      private Integer type;

      /**
     * 开放ip限制
     */
      private Boolean ipOpen;

      /**
     * 最后更改密码时间
     */
      private LocalDateTime lastChangePasswordDate;

      /**
     * 备注
     */
      private String remark;

      /**
     * 创建时间
     */
      private LocalDateTime createDate;

      /**
     * 创建用户主键
     */
      private Long createUserId;

      /**
     * 创建人
     */
      private String createUserName;

      /**
     * 修改时间
     */
      private LocalDateTime modifyDate;

      /**
     * 修改用户主键
     */
      private Long modifyUserId;

      /**
     * 修改人
     */
      private String modifyUserName;

      /**
     * 删除时间
     */
      private LocalDateTime deleteDate;

      /**
     * 删除用户主键
     */
      private Long deleteUserId;

      /**
     * 删除人
     */
      private String deleteUserName;

      /**
     * 是否删除[0否 1是]
     */
      private Boolean isDeleted;

    
    public Long getUserId() {
        return userId;
    }

      public void setUserId(Long userId) {
          this.userId = userId;
      }
    
    public String getUserName() {
        return userName;
    }

      public void setUserName(String userName) {
          this.userName = userName;
      }
    
    public String getUserEnname() {
        return userEnname;
    }

      public void setUserEnname(String userEnname) {
          this.userEnname = userEnname;
      }
    
    public String getEmail() {
        return email;
    }

      public void setEmail(String email) {
          this.email = email;
      }
    
    public String getPassword() {
        return password;
    }

      public void setPassword(String password) {
          this.password = password;
      }
    
    public Integer getSex() {
        return sex;
    }

      public void setSex(Integer sex) {
          this.sex = sex;
      }
    
    public Integer getStatus() {
        return status;
    }

      public void setStatus(Integer status) {
          this.status = status;
      }
    
    public String getMobile() {
        return mobile;
    }

      public void setMobile(String mobile) {
          this.mobile = mobile;
      }
    
    public String getQq() {
        return qq;
    }

      public void setQq(String qq) {
          this.qq = qq;
      }
    
    public String getAvatar() {
        return avatar;
    }

      public void setAvatar(String avatar) {
          this.avatar = avatar;
      }
    
    public Long getCompanyId() {
        return companyId;
    }

      public void setCompanyId(Long companyId) {
          this.companyId = companyId;
      }
    
    public Long getSuperiorId() {
        return superiorId;
    }

      public void setSuperiorId(Long superiorId) {
          this.superiorId = superiorId;
      }
    
    public String getSuperiorName() {
        return superiorName;
    }

      public void setSuperiorName(String superiorName) {
          this.superiorName = superiorName;
      }
    
    public String getQrCode() {
        return qrCode;
    }

      public void setQrCode(String qrCode) {
          this.qrCode = qrCode;
      }
    
    public String getPosition() {
        return position;
    }

      public void setPosition(String position) {
          this.position = position;
      }
    
    public String getLastLoginIp() {
        return lastLoginIp;
    }

      public void setLastLoginIp(String lastLoginIp) {
          this.lastLoginIp = lastLoginIp;
      }
    
    public LocalDateTime getLastLoginDate() {
        return lastLoginDate;
    }

      public void setLastLoginDate(LocalDateTime lastLoginDate) {
          this.lastLoginDate = lastLoginDate;
      }
    
    public LocalDateTime getRegDate() {
        return regDate;
    }

      public void setRegDate(LocalDateTime regDate) {
          this.regDate = regDate;
      }
    
    public Integer getType() {
        return type;
    }

      public void setType(Integer type) {
          this.type = type;
      }
    
    public Boolean getIpOpen() {
        return ipOpen;
    }

      public void setIpOpen(Boolean ipOpen) {
          this.ipOpen = ipOpen;
      }
    
    public LocalDateTime getLastChangePasswordDate() {
        return lastChangePasswordDate;
    }

      public void setLastChangePasswordDate(LocalDateTime lastChangePasswordDate) {
          this.lastChangePasswordDate = lastChangePasswordDate;
      }
    
    public String getRemark() {
        return remark;
    }

      public void setRemark(String remark) {
          this.remark = remark;
      }
    
    public LocalDateTime getCreateDate() {
        return createDate;
    }

      public void setCreateDate(LocalDateTime createDate) {
          this.createDate = createDate;
      }
    
    public Long getCreateUserId() {
        return createUserId;
    }

      public void setCreateUserId(Long createUserId) {
          this.createUserId = createUserId;
      }
    
    public String getCreateUserName() {
        return createUserName;
    }

      public void setCreateUserName(String createUserName) {
          this.createUserName = createUserName;
      }
    
    public LocalDateTime getModifyDate() {
        return modifyDate;
    }

      public void setModifyDate(LocalDateTime modifyDate) {
          this.modifyDate = modifyDate;
      }
    
    public Long getModifyUserId() {
        return modifyUserId;
    }

      public void setModifyUserId(Long modifyUserId) {
          this.modifyUserId = modifyUserId;
      }
    
    public String getModifyUserName() {
        return modifyUserName;
    }

      public void setModifyUserName(String modifyUserName) {
          this.modifyUserName = modifyUserName;
      }
    
    public LocalDateTime getDeleteDate() {
        return deleteDate;
    }

      public void setDeleteDate(LocalDateTime deleteDate) {
          this.deleteDate = deleteDate;
      }
    
    public Long getDeleteUserId() {
        return deleteUserId;
    }

      public void setDeleteUserId(Long deleteUserId) {
          this.deleteUserId = deleteUserId;
      }
    
    public String getDeleteUserName() {
        return deleteUserName;
    }

      public void setDeleteUserName(String deleteUserName) {
          this.deleteUserName = deleteUserName;
      }
    
    public Boolean getDeleted() {
        return isDeleted;
    }

      public void setDeleted(Boolean isDeleted) {
          this.isDeleted = isDeleted;
      }

    @Override
    protected Serializable pkVal() {
          return this.userId;
      }

    @Override
    public String toString() {
        return "SysUser{" +
              "userId=" + userId +
                  ", userName=" + userName +
                  ", userEnname=" + userEnname +
                  ", email=" + email +
                  ", password=" + password +
                  ", sex=" + sex +
                  ", status=" + status +
                  ", mobile=" + mobile +
                  ", qq=" + qq +
                  ", avatar=" + avatar +
                  ", companyId=" + companyId +
                  ", superiorId=" + superiorId +
                  ", superiorName=" + superiorName +
                  ", qrCode=" + qrCode +
                  ", position=" + position +
                  ", lastLoginIp=" + lastLoginIp +
                  ", lastLoginDate=" + lastLoginDate +
                  ", regDate=" + regDate +
                  ", type=" + type +
                  ", ipOpen=" + ipOpen +
                  ", lastChangePasswordDate=" + lastChangePasswordDate +
                  ", remark=" + remark +
                  ", createDate=" + createDate +
                  ", createUserId=" + createUserId +
                  ", createUserName=" + createUserName +
                  ", modifyDate=" + modifyDate +
                  ", modifyUserId=" + modifyUserId +
                  ", modifyUserName=" + modifyUserName +
                  ", deleteDate=" + deleteDate +
                  ", deleteUserId=" + deleteUserId +
                  ", deleteUserName=" + deleteUserName +
                  ", isDeleted=" + isDeleted +
              "}";
    }
}
