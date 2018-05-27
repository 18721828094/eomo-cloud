package com.prato.cloud.repository;

import com.prato.cloud.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: AreaRepository
 * @Description: 地区Dao数据持久层操作接口
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月28日
 * 
 */
@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {
	/**
	 * 根据地区编码查找地区信息
	 * 
	 * @param areaCode 地区编码
	 * @return
	 */
	List<Area> findByAreaCode(String areaCode);
}
