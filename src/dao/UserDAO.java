package dao;

import model.User;
import util.AbstractDao;

public class UserDAO extends AbstractDao{

	public void save(User entity) {
		persist(entity);
	}
}
