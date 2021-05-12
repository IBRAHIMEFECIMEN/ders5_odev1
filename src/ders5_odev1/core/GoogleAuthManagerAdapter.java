package ders5_odev1.core;

import ders5_odev1.business.abtracts.UserService;
import ders5_odev1.dataAccess.concretes.InMemoryUserDao;
import ders5_odev1.entities.concretes.LoginDto;
import ders5_odev1.entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService{
	
	private UserService userService;
	

	public GoogleAuthManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(String email) {
		if(userExists(email)==false) {
			userService.add(null);
		}
		else {
			User user =userService.get(email);
			
			LoginDto dto=new LoginDto();
			dto.setEmail(user.getEmail());
			dto.setPassword(user.getPassword());
			
			login(dto);
		}
		
	}

	@Override
	public boolean userExists(String email) {
		if(userService.get(email)!=null)
		{
			return true;
			
		}
		return false;
	}

	@Override
	public void login(LoginDto dto) {
		if(dto!=null && dto.getPassword().equals(dto.getPassword())) {
			System.out.println("Başarıyla Giriş yaptınız.");
		}
		else {
			System.out.println("Kullanıcı adı veya şifren yanlıþ");
		}
		
		
		
	}

}