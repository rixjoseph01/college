package com.example.collegeadm;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.example.collegeadm.User;
import com.example.collegeadm.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateUser() {
		 User user =new User();
		 user.setSemail("amal@gmail.com");
		 user.setPassword("am1234");
		 user.setRole("student");
		 user.setSname("Amal Chacko");
		 
		 User savedUser = repo.save(user);
		 
		 User existUser=entityManager.find(User.class, savedUser.getId());
		 
		 assertThat(existUser.getSemail()).isEqualTo(user.getSemail());
	}
	
	@Test
	public void testFindUserByEmail() {
		String semail="sah@gmail.com";
		
		User user=repo.findByEmail(semail);
		
		assertThat(user).isNotNull();
	}
}
