package a24_À©µµ¿ìºô´õ.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class User {
	private int id;
	private String username;
	private String password;
	private String name;
	private String email;
	private Date create_date;
	private Date update_date;
	
	
}
