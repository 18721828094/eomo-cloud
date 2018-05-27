package com.prato.cloud.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: Menu
 * @Description: 权限管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2016年5月26日
 *
 */
@Data
@Entity
@Table(name = "sys_privilege")
public class Privilege {
    /**
     * 权限编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 权限名称
     */
    @Column(name = "name", length = 32)
    private String name;

    /**
     * 权限url
     */
    @Column(name = "url", length = 32)
    private String permissionUrl;

    /**
     *请求方法
     */
    @Column(name = "method")
    private String method;

    /**
     * 权限类型(0：目录 1：权限 2：按钮)
     */
    @Column(name = "type")
    private Integer type;

    /**
     * 权限图标
     */
    @Column(name = "icon", length = 32)
    private String icon;

    /**
     * 权限等级
     */
    @Column
    private Integer grade;

    /**
     * 权限排序
     */
    @Column
    private Integer sort;

    /**
     * 是否可用
     */
    @Column
    private boolean available;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createTime;

    /**
     * 修改时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updateTime;

    /**
     * 父级权限
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Privilege parent;

    /**
     * 下级权限列表
     */
    @OneToMany(targetEntity = Privilege.class, cascade = { CascadeType.ALL }, mappedBy = "parent")
    @Fetch(FetchMode.SUBSELECT)
    @OrderBy("sort")
    private Set<Privilege> children = new HashSet<Privilege>();

    /**
     * 多对多关联角色
     */
    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Role.class, cascade = CascadeType.ALL, mappedBy = "privileges")
    private Set<Role> roles = new HashSet<Role>();
}
