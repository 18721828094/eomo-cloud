package com.prato.cloud.repository;

import javax.transaction.Transactional;

import com.prato.cloud.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: UserRepository
 * @Description: 用户Dao数据持久层操作接口
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月2日
 * 
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	/**
	 * 根据用户ID查询用户信息
	 * @param id
	 * @return
	 */
	@Query( value = "select u from User u where u.id=:id")
	public User findById(@Param("id") long id);

	/**
	 * 通过用户名查询用户信息（含有角色信息）
	 * @param username 用户名
	 * @return
	 */
	@Query("from User where username=:username")
	public User findByUserName(@Param("username") String username);

	/**
	 * 通过用户名和密码查询用户信息
	 * 
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	@Query(value = "select u from User u where u.username=:username and u.password=:password")
	public User findByUserNameAndPassword(String username, String password);

	/**
	 * 通过手机号查询用户信息（含有角色信息）
	 *
	 * @param mobile 手机号码
	 * @return
	 */
	public User findByMobile(String mobile);

	/**
	 * 通过用户名模糊分页查询用户列表（含有角色信息）
	 * 
	 * @param username 用户名
	 * @return
	 */
	public Page<User> findByNameLike(String username, Pageable pageable);

	/**
	 * 根据用户名或者邮箱查询用户信息
	 * 
	 * @param username
	 * @param email
	 * @return
	 */
	public User findByUserNameOrEmail(String username, String email);
	/**
	 * 修改用户名
	 * 
	 * @param userName
	 * @param email
	 * @return
	 */
	@Modifying(clearAutomatically=true)
    @Transactional
    @Query("update User set userName=:userName where email=:email")
	public int modifyUserName(@Param("userName") String userName, @Param("email") String email);
	
	/**
	 * 修改密码
	 * 
	 * @param password
	 * @param email
	 * @return
	 */
	@Modifying(clearAutomatically=true)
    @Transactional
    @Query("update User set password=:password where email=:email")
	public int updatePassword(@Param("password") String password, @Param("email") String email);

	/**
	 * 分页查询用户
	 *
	 * @param pageable
	 * @return
	 */
	public Page<User> findAll(Pageable pageable);

	/**
	 * 多条件分页查询用户
	 *
	 * @param specification
	 * @param pageable
	 * @return
	 */
	public Page<User> findAll(Specification<User> specification, Pageable pageable);

	Page<User> findByIdIn(List<Integer> relationshipList, java.awt.print.Pageable pageable);
}
