package a24_���������.swing.dto;

import a24_���������.domain.user.User;
import lombok.Data;

@Data
public class AccountsDto {
	private String name;
	private String email;
	private String password;
	
	public User toEntity(int id) {
		return User.builder()
				.id(id)
				.password(password)
				.name(name)
				.email(email)
				.build();
	}
}
