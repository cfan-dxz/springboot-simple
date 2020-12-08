package com.example.mydemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 店铺表
 * </p>
 *
 * @author dengxz
 * @since 2020-04-15
 */
public class ComShop extends Model<ComShop> {

    private static final long serialVersionUID=1L;

      /**
     * 主键id
     */
        @TableId(value = "shop_id", type = IdType.AUTO)
      private Long shopId;

      /**
     * 系统店铺名称
     */
      private String shopName;

      /**
     * 公司ID
     */
      private Long companyId;

      /**
     * 平台
     */
      private Integer platformId;

      /**
     * 销售平台名称
     */
      private String platformName;

      /**
     * 平台店铺名称
     */
      private String storeName;

      /**
     * 店铺注册邮箱
     */
      private String storeEmail;

      /**
     * 店铺站点
     */
      private String storeSite;

      /**
     * 店铺地址
     */
      private String storeUrl;

      /**
     * 商户id
     */
      private String merchantId;

      /**
     * 授权token
     */
      private String accessToken;

      /**
     * token过期时间
     */
      private LocalDateTime accessTokenExpireTime;

      /**
     * 刷新token
     */
      private String refreshToken;

      /**
     * 刷新token过期时间
     */
      private LocalDateTime refreshTokenExpireTime;

      /**
     * appKey
     */
      private String appKey;

      /**
     * app密钥
     */
      private String appSecret;

      /**
     * api请求邮箱
     */
      private String apiEmail;

      /**
     * api登录账号
     */
      private String apiLogin;

      /**
     * api登录密码
     */
      private String apiPwd;

      /**
     * 授权回调地址
     */
      private String redirectUri;

      /**
     * 是否启用（0否 1是）
     */
      private Boolean isEnabled;

      /**
     * 是否授权（0否 1是）
     */
      private Boolean isAuth;

      /**
     * 店铺类型：服装组、饰品组、电子组
     */
      private String shopType;

      /**
     * 订单最后下载时间
     */
      private LocalDateTime orderDownloadTime;

      /**
     * 在线产品最后下载时间
     */
      private LocalDateTime listingDownloadTime;

      /**
     * 活动下载时间
     */
      private LocalDateTime campaignDownloadTime;

      /**
     * 退款下载时间
     */
      private LocalDateTime refundDownloadTime;

      /**
     * SKU前缀
     */
      private String prefix;

      /**
     * 店铺负责人id
     */
      private Long managerUserId;

      /**
     * 店铺负责人
     */
      private String managerUserName;

      /**
     * ebay新api授权token
     */
      private String ebayAccessToken;

      /**
     * ebay新api授权过期事件
     */
      private LocalDateTime ebayAccessTokenExpireTime;

      /**
     * 默认发货中心(可用于库存同步逻辑)
     */
      private Integer warehouseId;

      /**
     * 添加时间
     */
      private LocalDateTime createDate;

      /**
     * 添加人id
     */
      private Long createUserId;

      /**
     * 添加人
     */
      private String createUserName;

      /**
     * 更新时间
     */
      private LocalDateTime modifyDate;

      /**
     * 更新人id
     */
      private Long modifyUserId;

      /**
     * 更信人
     */
      private String modifyUserName;

      /**
     * 删除时间
     */
      private LocalDateTime deleteDate;

      /**
     * 删除人id
     */
      private Long deleteUserId;

      /**
     * 删除人
     */
      private String deleteUserName;

      /**
     * 软删除
     */
      private Boolean isDeleted;

    
    public Long getShopId() {
        return shopId;
    }

      public void setShopId(Long shopId) {
          this.shopId = shopId;
      }
    
    public String getShopName() {
        return shopName;
    }

      public void setShopName(String shopName) {
          this.shopName = shopName;
      }
    
    public Long getCompanyId() {
        return companyId;
    }

      public void setCompanyId(Long companyId) {
          this.companyId = companyId;
      }
    
    public Integer getPlatformId() {
        return platformId;
    }

      public void setPlatformId(Integer platformId) {
          this.platformId = platformId;
      }
    
    public String getPlatformName() {
        return platformName;
    }

      public void setPlatformName(String platformName) {
          this.platformName = platformName;
      }
    
    public String getStoreName() {
        return storeName;
    }

      public void setStoreName(String storeName) {
          this.storeName = storeName;
      }
    
    public String getStoreEmail() {
        return storeEmail;
    }

      public void setStoreEmail(String storeEmail) {
          this.storeEmail = storeEmail;
      }
    
    public String getStoreSite() {
        return storeSite;
    }

      public void setStoreSite(String storeSite) {
          this.storeSite = storeSite;
      }
    
    public String getStoreUrl() {
        return storeUrl;
    }

      public void setStoreUrl(String storeUrl) {
          this.storeUrl = storeUrl;
      }
    
    public String getMerchantId() {
        return merchantId;
    }

      public void setMerchantId(String merchantId) {
          this.merchantId = merchantId;
      }
    
    public String getAccessToken() {
        return accessToken;
    }

      public void setAccessToken(String accessToken) {
          this.accessToken = accessToken;
      }
    
    public LocalDateTime getAccessTokenExpireTime() {
        return accessTokenExpireTime;
    }

      public void setAccessTokenExpireTime(LocalDateTime accessTokenExpireTime) {
          this.accessTokenExpireTime = accessTokenExpireTime;
      }
    
    public String getRefreshToken() {
        return refreshToken;
    }

      public void setRefreshToken(String refreshToken) {
          this.refreshToken = refreshToken;
      }
    
    public LocalDateTime getRefreshTokenExpireTime() {
        return refreshTokenExpireTime;
    }

      public void setRefreshTokenExpireTime(LocalDateTime refreshTokenExpireTime) {
          this.refreshTokenExpireTime = refreshTokenExpireTime;
      }
    
    public String getAppKey() {
        return appKey;
    }

      public void setAppKey(String appKey) {
          this.appKey = appKey;
      }
    
    public String getAppSecret() {
        return appSecret;
    }

      public void setAppSecret(String appSecret) {
          this.appSecret = appSecret;
      }
    
    public String getApiEmail() {
        return apiEmail;
    }

      public void setApiEmail(String apiEmail) {
          this.apiEmail = apiEmail;
      }
    
    public String getApiLogin() {
        return apiLogin;
    }

      public void setApiLogin(String apiLogin) {
          this.apiLogin = apiLogin;
      }
    
    public String getApiPwd() {
        return apiPwd;
    }

      public void setApiPwd(String apiPwd) {
          this.apiPwd = apiPwd;
      }
    
    public String getRedirectUri() {
        return redirectUri;
    }

      public void setRedirectUri(String redirectUri) {
          this.redirectUri = redirectUri;
      }
    
    public Boolean getEnabled() {
        return isEnabled;
    }

      public void setEnabled(Boolean isEnabled) {
          this.isEnabled = isEnabled;
      }
    
    public Boolean getAuth() {
        return isAuth;
    }

      public void setAuth(Boolean isAuth) {
          this.isAuth = isAuth;
      }
    
    public String getShopType() {
        return shopType;
    }

      public void setShopType(String shopType) {
          this.shopType = shopType;
      }
    
    public LocalDateTime getOrderDownloadTime() {
        return orderDownloadTime;
    }

      public void setOrderDownloadTime(LocalDateTime orderDownloadTime) {
          this.orderDownloadTime = orderDownloadTime;
      }
    
    public LocalDateTime getListingDownloadTime() {
        return listingDownloadTime;
    }

      public void setListingDownloadTime(LocalDateTime listingDownloadTime) {
          this.listingDownloadTime = listingDownloadTime;
      }
    
    public LocalDateTime getCampaignDownloadTime() {
        return campaignDownloadTime;
    }

      public void setCampaignDownloadTime(LocalDateTime campaignDownloadTime) {
          this.campaignDownloadTime = campaignDownloadTime;
      }
    
    public LocalDateTime getRefundDownloadTime() {
        return refundDownloadTime;
    }

      public void setRefundDownloadTime(LocalDateTime refundDownloadTime) {
          this.refundDownloadTime = refundDownloadTime;
      }
    
    public String getPrefix() {
        return prefix;
    }

      public void setPrefix(String prefix) {
          this.prefix = prefix;
      }
    
    public Long getManagerUserId() {
        return managerUserId;
    }

      public void setManagerUserId(Long managerUserId) {
          this.managerUserId = managerUserId;
      }
    
    public String getManagerUserName() {
        return managerUserName;
    }

      public void setManagerUserName(String managerUserName) {
          this.managerUserName = managerUserName;
      }
    
    public String getEbayAccessToken() {
        return ebayAccessToken;
    }

      public void setEbayAccessToken(String ebayAccessToken) {
          this.ebayAccessToken = ebayAccessToken;
      }
    
    public LocalDateTime getEbayAccessTokenExpireTime() {
        return ebayAccessTokenExpireTime;
    }

      public void setEbayAccessTokenExpireTime(LocalDateTime ebayAccessTokenExpireTime) {
          this.ebayAccessTokenExpireTime = ebayAccessTokenExpireTime;
      }
    
    public Integer getWarehouseId() {
        return warehouseId;
    }

      public void setWarehouseId(Integer warehouseId) {
          this.warehouseId = warehouseId;
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
          return this.shopId;
      }

    @Override
    public String toString() {
        return "ComShop{" +
              "shopId=" + shopId +
                  ", shopName=" + shopName +
                  ", companyId=" + companyId +
                  ", platformId=" + platformId +
                  ", platformName=" + platformName +
                  ", storeName=" + storeName +
                  ", storeEmail=" + storeEmail +
                  ", storeSite=" + storeSite +
                  ", storeUrl=" + storeUrl +
                  ", merchantId=" + merchantId +
                  ", accessToken=" + accessToken +
                  ", accessTokenExpireTime=" + accessTokenExpireTime +
                  ", refreshToken=" + refreshToken +
                  ", refreshTokenExpireTime=" + refreshTokenExpireTime +
                  ", appKey=" + appKey +
                  ", appSecret=" + appSecret +
                  ", apiEmail=" + apiEmail +
                  ", apiLogin=" + apiLogin +
                  ", apiPwd=" + apiPwd +
                  ", redirectUri=" + redirectUri +
                  ", isEnabled=" + isEnabled +
                  ", isAuth=" + isAuth +
                  ", shopType=" + shopType +
                  ", orderDownloadTime=" + orderDownloadTime +
                  ", listingDownloadTime=" + listingDownloadTime +
                  ", campaignDownloadTime=" + campaignDownloadTime +
                  ", refundDownloadTime=" + refundDownloadTime +
                  ", prefix=" + prefix +
                  ", managerUserId=" + managerUserId +
                  ", managerUserName=" + managerUserName +
                  ", ebayAccessToken=" + ebayAccessToken +
                  ", ebayAccessTokenExpireTime=" + ebayAccessTokenExpireTime +
                  ", warehouseId=" + warehouseId +
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
