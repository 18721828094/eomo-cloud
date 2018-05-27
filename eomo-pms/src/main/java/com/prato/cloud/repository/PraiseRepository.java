package com.prato.cloud.repository;

import com.prato.cloud.entity.Praise;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: PraiseRepository
 * @Description: TODO
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月30日
 * 
 */
public interface PraiseRepository extends JpaRepository<Praise, Long> {
	Long countByCollectId(Long collectId);

	Praise findByUserIdAndCollectId(Long userId, Long collectId);
}
