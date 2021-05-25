package javaHomework5.core.concretes;

import javaHomework5.core.abstracts.AuthService;
import javaHomework5.googleAuthentication.GoogleAuth;

public class GoogleAuthManagerAdapter implements AuthService {

	@Override
	public void register() {
		GoogleAuth googleAuth = new GoogleAuth();
		googleAuth.GoogleAuthentication();
		
	}

}
