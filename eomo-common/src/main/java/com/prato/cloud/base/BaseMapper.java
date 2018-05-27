package com.prato.cloud.base;

import java.io.Serializable;
import java.util.List;

/**
 * BaseMapper 统一数据访问接口
 * @param <T>
 * @param <E>
 */
public interface BaseMapper<T, E extends Serializable> {
    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    T selectByPrimaryKey(E id);

    /**
     * 插入
     *
     * @param record
     * @return
     */
    int insert(T record);

    /**
     * 插入非空字段
     *
     * @param record
     * @return
     */
    int insertSelective(T record);

    /**
     * 更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(T record);

    /**
     * 更新非空数据
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(E id);

    /**
     * 查询
     *
     * @param record
     * @return
     */
    List<T> selectListByPage(T record);
}
