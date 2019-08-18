package main.java.dao;

import main.java.model.User;
import main.java.util.AbstractDao;

public class UserDAO extends AbstractDao{

	public void save(User entity) {
		persist(entity);
	}
}
