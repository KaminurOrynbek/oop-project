package DigitalCameraStore.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import DigitalCameraStore.com.POJO.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
