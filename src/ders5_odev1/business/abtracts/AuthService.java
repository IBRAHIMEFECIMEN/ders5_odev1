package ders5_odev1.business.abtracts;

import ders5_odev1.entities.concretes.LoginDto;
import ders5_odev1.entities.concretes.User;

public interface AuthService {
	
	void register(User user);
	void verify(User user,String token);
	boolean userExists(String email);
	void login(LoginDto dto);
}
