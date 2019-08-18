package controller.users;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.User;
import service.UserService;

@ManagedBean(name="signUpMB")
@ViewScoped
public class SignUpMB implements Serializable {

	private static final long serialVersionUID = -2323448892888150025L;
	
	private String email;
	private String password;
	private String verifyPassword;
	
	//TODO UNIT TEST
	public void verifyPasswordIsTheSame() {
		if(password.equals(verifyPassword)) {
			User user = new User(email,password);
			new UserService().saveUser(user);
		}else {
			//TODO MENSAGEM ERRO
		}
	}
	
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