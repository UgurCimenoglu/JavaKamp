package javaHomework5;

import javaHomework5.business.concretes.UserManager;
import javaHomework5.core.concretes.GoogleAuthManagerAdapter;
import javaHomework5.dataAccess.concretes.HibernateUserDao;
import javaHomework5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager user = new UserManager(new HibernateUserDao(),new GoogleAuthManagerAdapter());
		//user.register(new User(1, "Ugur", "Cimen", "ugur@gmail.com", "123123"));
		user.registerWithOtherService();
		user.login(new User(1, "Ugur", "Cimen", "ugur@gmail.com", "123123"));
	}

}
