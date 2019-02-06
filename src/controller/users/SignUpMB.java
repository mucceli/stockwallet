package controller.users;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="signUpMB")
@ViewScoped
public class SignUpMB implements Serializable {

	private static final long serialVersionUID = -2323448892888150025L;
	
	private String email;
	private String password;
	private String verifyPassword;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVerifyPassword() {
		return verifyPassword;
	}
	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

}