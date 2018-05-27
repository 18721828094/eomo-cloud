package com.prato.cloud.drools.rule;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
/**
 * @ClassName: Rule
 * @Description: 定义规则实体,创建Fact对象
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年5月27日
 *
 */
public class Rule implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "rule_key", nullable = false, unique = true)
    private String ruleKey;

    @Column(nullable = false)
    private String content;

    private String version;

    private String lastModifyTime;

    private String createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
