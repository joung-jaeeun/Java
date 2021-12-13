package a19_���׸�;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
class Error {
	private int errorNumber;
	private String msg;
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class webError extends Error {
	private String msgDtl;
	
}


@Data
@AllArgsConstructor
@NoArgsConstructor

class Message <T> {
	private int code;
	private T msg;
	
}
@Data
@AllArgsConstructor
@NoArgsConstructor

class ErrorMessage <T extends Error>{
	private int code;
	private T msg;
	
}



public class GenericEx {

	public static void main(String[] args) {
		Message <?>m = new Message<String>(200,"���ۼ���");
		System.out.println(m);
		
		
		Message<?> m2 = new Message<Error>(400, new Error(3,"��ο� ������ ������ �����ϴ�."));
		System.out.println(m2);


		ErrorMessage<? extends Error> em = new ErrorMessage<webError>(400, new webError("���ּ� ����"));
		System.out.println(em);
		
		
		
	
	}

}
