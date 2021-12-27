package a24_���������.swing.dto;


import a24_���������.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SigninDto {
	private String username;
	private String password;
	
	
	public User toEntity() {
		return User.builder()
				.username(username)
				.password(password)
				.build();
		
	
	}

}
