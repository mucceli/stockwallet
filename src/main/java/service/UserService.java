package main.java.service;

import java.io.Serializable;

import main.java.dao.UserDAO;
import main.java.model.User;

public class UserService implements Serializable {

	private static final long serialVersionUID = -3187404599343778325L;
	
	public void saveUser(User user) {
		new UserDAO().save(user);
	}

}
