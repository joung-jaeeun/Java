package a22_�����ͺ��̽�;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder

public class User {
	private int id;
	private String username;
	private String password;
	private String name;
	private String email;
	private LocalDateTime create_date;
	private LocalDateTime update_date;
	
	
}
