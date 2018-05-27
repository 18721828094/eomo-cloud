package com.prato.cloud.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ClassName: StationType
 * @Description: 站点类型管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2016年5月26日
 *
 */
@Entity
@Table(name = "eomo_aws_station_type")
public class StationType  {
    private Integer id;             // 站点类型id
    private String name;            // 名称
    private String value;           // 值
    private boolean visible;        // 可见性
    private String statisticsType;  // 统计类型

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getStatisticsType() {
        return statisticsType;
    }

    public void setStatisticsType(String statisticsType) {
        this.statisticsType = statisticsType;
    }
}
