package a24_���������.session;

import a24_���������.domain.user.User;
import lombok.Data;


@Data

public class Principal {
	private static Principal instance = new Principal();
	private User user;

	
	public static Principal getInstance() {
		if(instance == null) {
			instance = new Principal();
			
		}
		return instance;	
	}
	
	
	
	
	
	
	
	

}
