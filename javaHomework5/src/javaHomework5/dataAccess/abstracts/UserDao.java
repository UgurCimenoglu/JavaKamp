package javaHomework5.dataAccess.abstracts;

import javaHomework5.entities.concretes.User;

public interface UserDao {
	void login(User user);
	void register(User user);
}
