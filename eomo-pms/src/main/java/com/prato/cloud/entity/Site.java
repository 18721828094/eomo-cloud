package com.prato.cloud.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
/**
 * @ClassName: Menu
 * @Description: 权限管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2016年5月26日
 *
 */
@Entity
@Table(name = "eomo_aws_site")
public class Site {
    /**
     * 站点编号
     */
    @Id
    @GeneratedValue(generator = "keyid")
    @GenericGenerator(name = "site_id", strategy = "identity")
    @Column(name = "site_id", unique = true, nullable = false)
    private Integer id;

    /**
     * 站点名称
     */
    @Column(name = "name", length = 32, nullable = false)
    private String name;

    /**
     * 站点标题
     */
    @Column(name = "title", length = 32, nullable = false)
    private String title;

    /**
     * 站点logo
     */
    @Column(name = "logo", length = 32, nullable = false)
    private String logo;

    /**
     * 描述，填写有助于搜索引擎优化
     */
    @Column(name = "description", length = 32)
    private String description;

    /**
     * 域名
     */
    @Column(name = "domain", length = 32)
    private String domain;

    /**
     * 关键字，填写有助于搜索引擎优化
     */
    @Column(name = "keywords", length = 80)
    private String keywords;

    /**
     * 主题
     */
    @Column(name = "theme", length = 60)
    private String theme;

    /**
     * 版权信息
     */
    @Column(name = "copyright", length = 80)
    private String copyright;
    /**
     * 自定义首页
     */
    @Column(name = "home_page", length = 60)
    private String homePage;

    /**
     * 标记
     */
    @Column(name = "flag", length = 60)
    private boolean flag;

    /**
     * 备注信息
     */
    @Column
    private String remark;
    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time")
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
