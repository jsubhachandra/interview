package com.taxi.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=UserRepositoryImpl.class)
public class UserRepositoryImplTest {

    private UserRepositoryImpl service = new UserRepositoryImpl();
	
	@Test
	public void saveDriverTest() {
		service.getUserById(1);
	}


}
