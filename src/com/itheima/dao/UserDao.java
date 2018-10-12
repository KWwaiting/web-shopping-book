package com.itheima.dao;
import org.apache.ibatis.annotations.Param;
import com.itheima.po.User;

import java.util.List;

/**
 * 用户DAO层接口
 */
public interface UserDao {
	/**
	 * 通过账号和密码查询用户
	 */
	public User findUser(User user);
	public int doAdd(User user);
	public List<User> selectUserAll(User user);
	public List<User> selectUserList(User user);
	public int doAddUser(User user);
	public User findUserById(Integer id);
	public int updateUser(User user);
	public int deleteUser(Integer id);
	public List<User> selectOne(User user);

}
