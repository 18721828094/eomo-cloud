package com.prato.cloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Albert Ge
 * @version 1.2.0
 * @ClassName: User
 * @Description: 用户管理模块实体类
 * @date 2016年5月26日
 */
@Data
@Entity
@Table(name = "sys_user")
public class User {
    /**
     * 用户编号主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 用户账号
     */
    @NotEmpty(message = "账号不能为空")
    @Size(min = 4, max = 20, message = "用户名长度必须为4-20个字符")
    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,10}$", message = "用户名必须是数字和字母组合 6-10位之间")
    @Column(name = "userame", length = 32, unique = true, nullable = false)
    private String username;

    /**
     * 密码
     */
    @NotEmpty(message = "密码不能为空")
    @Size(max=100)
    @Column(name = "password", length = 100)
    private String password;

    /**
     * 姓名
     */
    @NotEmpty(message = "姓名不能为空")
    @Size(min = 2, max = 20)
    @Column(name = "name", length = 20, nullable = false)
    private String name;

    /**
     * 电话
     */
    @Column(name = "phone", length = 32)
    private String phone;

    /**
     * 电子邮件
     */
    @NotEmpty(message = "邮箱不能为空")
    @Size(max = 50)
    @Email(message = "邮箱格式不对")
    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    /**
     * 手机
     */
    @Column(name = "mobile", length = 32)
    private String mobile;

    /**
     * 头像
     */
    @Size(max = 200, message = "头像链接长度最多200个字符")
    @Column(name = "avatar", length = 200)
    private String avatar;

    /**
     * 登录状态(1：启用 2：冻结 3：删除）
     */
    @Column(name = "status", length = 10)
    private String status;

    @Column
    private Date lastLoginTime;

    /**
     * 验证码
     */
    @JsonIgnore
    @Size(max = 20)
    @Column(name = "activation_key", length = 20)
    private String activationKey;

    private Integer followSize = 0;//关注数

    private Integer fanSize = 0; //粉丝数

    @Transient
    private Integer isFriend = 0;//关系，0表示没有关系，2表示互相关注

    /**
     * 创建时间
     */
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date createTime;
    /**
     * 修改时间
     */
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date updateTime;

    /**
     * 多对一关联部门
     */
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Dept.class)
    @JoinColumn(name = "dept_id", referencedColumnName = "id")
    private Dept department;

    /**
     * 多对多关联角色
     */
    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Role.class)
    @JoinTable(name = "sys_user_role", joinColumns = {
            @JoinColumn(name = "user_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "role_id", referencedColumnName = "id")})
    private Set<Role> roles = new HashSet<Role>();
}