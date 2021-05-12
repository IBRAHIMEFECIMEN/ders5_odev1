package ders5_odev1.core;

import ders5_odev1.entities.concretes.LoginDto;

public interface ExternalAuthService {
	
	void register(String email);
	boolean userExists(String email);
	void login(LoginDto dto);
}