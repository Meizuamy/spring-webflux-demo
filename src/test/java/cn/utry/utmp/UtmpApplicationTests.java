package cn.utry.utmp;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cn.utry.utmp.mapper.UserMapper;
import cn.utry.utmp.model.User;

@SpringBootTest
class UtmpApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	void contextLoads() {
		User user = new User(3L,"wang","河南");
		userMapper.saveUser(user);

		List<User> users = userMapper.getUserList();

		for(User u : users){
			System.out.println(u);
		}
	}

}
