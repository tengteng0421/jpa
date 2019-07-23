package com.teng.jpa;

import com.teng.jpa.dao.UserRepository;
import com.teng.jpa.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class userRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void userTest() {
        List<Users> usersList = this.userRepository.findAll();
        for (Users u : usersList) {
            System.out.println(u.toString());
        }
    }

    @Test
    public void testSave() {
        Users users = new Users();
        users.setName("滕腾1");
        users.setAge(3);
        users.setAddress("沈阳");
        this.userRepository.save(users);
    }
}
