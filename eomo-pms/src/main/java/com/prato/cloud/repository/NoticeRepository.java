package com.prato.cloud.repository;

import com.prato.cloud.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @ClassName: NoticeRepository
 * @Description: TODO
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月30日
 * 
 */
public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
