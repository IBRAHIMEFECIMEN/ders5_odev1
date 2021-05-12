package ders5_odev1.core.amazonEmail;

import ders5_odev1.amazonEmail.AmazonMailManager;
import ders5_odev1.core.EmailService;

public class AmazonMailManagerAdapter implements EmailService {
	
	
	private AmazonMailManager amazonMailManager;

	public AmazonMailManagerAdapter() {
		super();
		this.amazonMailManager = new AmazonMailManager();
	}

	@Override
	public void send(String email, String message) {
		amazonMailManager.send(email, message);
		
		
	}

}