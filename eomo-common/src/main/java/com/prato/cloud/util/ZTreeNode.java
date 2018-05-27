package com.prato.cloud.util;

/**
 * jquery ztree 插件的节点
 */
public class ZTreeNode {
    private Long id;//节点id

    private Long pId;//父节点id

    private String name;//节点名称

    private String icon;//菜单图标

    private Boolean open;//是否打开节点

    private Boolean isParent;//是否是父级节点

    private Boolean checked;//是否被选中

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Boolean getParent() {
        return isParent;
    }

    public void setParent(Boolean parent) {
        isParent = parent;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
}
