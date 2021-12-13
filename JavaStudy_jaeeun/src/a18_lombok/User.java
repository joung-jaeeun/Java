package a18_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor//기본생성사
@AllArgsConstructor//전체생성자
//@Data //getter,setter,toString,Equals,HashCode
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	
	
	}
