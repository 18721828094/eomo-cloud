package com.prato.cloud.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "sys_role")
public class Role {
    /**
     * 角色编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 角色名称
     */
    @Column(name = "name", length = 32)
    private String name;

    /**
     * 角色编码
     */
    @Column(name = "name", length = 32)
    private String code;

    /**
     * 角色描述
     */
    @Column(name = "description", length=100)
    private String description;

    @Column(name = "status", length = 20)
    private String status;

    /**
     * 创建时间
     */
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 多对多关联用户
     */
    @ManyToMany(fetch = FetchType.LAZY, targetEntity = User.class, cascade = CascadeType.ALL, mappedBy = "roles")
    private Set<User> users = new HashSet<User>();

    /**
     * 多对多关联权限
     */
    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.MERGE, targetEntity = Privilege.class)
    @JoinTable(name = "sys_role_privilege", joinColumns = {
            @JoinColumn(name = "role_id", referencedColumnName = "id") }, inverseJoinColumns = {
            @JoinColumn(name = "privilege_id", referencedColumnName = "id") })
    private Set<Privilege> privileges = new HashSet<Privilege>();
}
