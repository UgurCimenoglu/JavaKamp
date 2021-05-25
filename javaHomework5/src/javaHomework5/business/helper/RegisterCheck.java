package javaHomework5.business.helper;

import java.util.regex.Pattern;

import javaHomework5.entities.concretes.User;

public class RegisterCheck {


	public static boolean Check(User user) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex);
		var result = pattern.matcher(user.getEmail()).matches();
		if (!result) {
			System.out.println("Lutfen email formatinda bir metin giriniz.");
			return false;
		}
		if (user.getEmail() == "admin@gmail.com") {
			System.out.println("Bu email zaten sistemde kayitli!");
			return false;
		}
		if (user.getPassword().length()<6) {
			System.out.println("Sifre 6 karakterden az olamaz!");
			return false;
		}
		if (user.getFirstName().length()<2 || user.getLastName().length()<2) {
			System.out.println("Isim soyisim 2 karakterden az olamaz!");
			return false;
		}
		
		EmailVerifyService.sendVerifyEmail(user.getEmail());
		return true;
	}
}
