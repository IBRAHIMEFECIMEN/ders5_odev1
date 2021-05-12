package ders5_odev1.business.abtracts;

import java.util.List;

import ders5_odev1.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void update(User user);
	void delete(int userId);
	User get(String email);
	List<User> getAll();
}
