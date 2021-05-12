package ders5_odev1;
import ders5_odev1.business.concretes.AuthManager;
import ders5_odev1.business.concretes.UserManager;
import ders5_odev1.core.amazonEmail.AmazonMailManagerAdapter;
import ders5_odev1.core.googleEmail.GoogleMailManagerAdapter;
import ders5_odev1.dataAccess.concretes.InMemoryUserDao;
import ders5_odev1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		 
		
		InMemoryUserDao inMemoryUserDao=new InMemoryUserDao();
		AuthManager authManager=new AuthManager(new UserManager(inMemoryUserDao, new AmazonMailManagerAdapter()));
			
		User efe=new User(1,"Ibrahim Efe","Cimen","ibrahimefecimen1@gmail.com","123456",true);
		User arda=new User(2,"Mehmet Arda","Cimen","mehmetardacimen@gmail.com","123456",true);
		
		
		authManager.register(arda);
		
		UserManager userManager=new UserManager(inMemoryUserDao, new GoogleMailManagerAdapter());
		//userManager.update(efe);
		//userManager.delete(3);
		userManager.getAll();
		
		
		
		
		
		
		
		
		

	}

}