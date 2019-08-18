package service;

import java.io.Serializable;

import dao.UserDAO;
import model.User;

public class UserService implements Serializable {

	private static final long serialVersionUID = -3187404599343778325L;
	
	public void saveUser(User user) {
		new UserDAO().save(user);
	}

}
