package com.service.base.dao;

import java.util.List;

import net.vlaba.util.reflection.EntityBuildUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageHelper;
import com.service.base.dao.UserDao;
import com.service.base.entity.UserEntity;
import com.service.base.enums.GenderEnum;

@RunWith(value = SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void insertSelectiveTest() {
		/*UserEntity user = new UserEntity();
		user.setName("aaa");
		user.setAge(10);
		user.setGender(GenderEnum.MAN);
		int result = userDao.insertSelective(user);
		System.out.println(result);*/
		
		for (int i = 0; i < 10; i++) {
			UserEntity user = EntityBuildUtil.randomEnitiy(UserEntity.class);
			user.setId(null);
			int result = userDao.insertSelective(user);
			System.out.println("result : " + result);
		}
	}
	
	@Test
	public void selectUsersTest() {
		PageHelper.startPage(4, 3);
		List<UserEntity> users = userDao.selectUsers();
		for (UserEntity user : users) {
			System.out.println(user.getId() + " : " + user.getName() + " : " + user.getAge() + " : " + user.getGender());
		}
	}
	
}
