package javaHomework5.business.concretes;

import javaHomework5.business.abstracts.UserService;
import javaHomework5.business.helper.LoginCheck;
import javaHomework5.business.helper.RegisterCheck;
import javaHomework5.core.abstracts.AuthService;
import javaHomework5.dataAccess.abstracts.UserDao;
import javaHomework5.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private AuthService authService;

	public UserManager(UserDao userDao, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void login(User user) {
		var result = LoginCheck.Login(user);
		if (result) {
			userDao.login(user);
		} else {
			System.out.println("Giris Basarisiz.");
		}

	}

	public void registerWithOtherService() {
		authService.register();
	}

	@Override
	public void register(User user) {

		var result = RegisterCheck.Check(user);
		if (result) {
			userDao.register(user);
		} else {
			System.out.println("Uyelik Olusturulamadi.");
		}

	}

}
