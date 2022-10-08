package br.com.cod3r.template.persist;

import br.com.cod3r.template.persist.models.UserModel;

public class Client {

	public static void main(String[] args) {
		final UserModel user = new UserModel("User", "password");
		user.save();

		System.out.println("---------");

		UserModel invalidUser = new UserModel(null, null);
		invalidUser.save();
	}
}
