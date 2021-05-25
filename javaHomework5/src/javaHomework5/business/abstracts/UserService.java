package javaHomework5.business.abstracts;

import javaHomework5.entities.concretes.User;

public interface UserService {
	void login(User user);
	void register(User user);
}
