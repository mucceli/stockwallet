package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="loginMB")
@ViewScoped
public class LoginMB {
	
	public String login() {
		return "stocks.xhtml";
	}
	
}
