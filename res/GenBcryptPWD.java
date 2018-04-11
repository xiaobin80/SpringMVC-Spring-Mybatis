package prjBcrypt;

import org.springframework.security.crypto.bcrypt.*;

public class TestBcrypt {
	
	public static void main(String[] args) {
		String strPwd = "password";
		BCryptPasswordEncoder pwdEncoder = new BCryptPasswordEncoder(10);
		
		String strPwdEncoder = pwdEncoder.encode(strPwd);
		System.out.println(strPwdEncoder);
	}
}
