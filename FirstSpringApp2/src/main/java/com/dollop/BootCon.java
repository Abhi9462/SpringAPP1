package com.dollop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("com.dollop")
public class BootCon {
	private String driver;
	private String url;
	private String password;
	private String user;
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "BootCon [driver=" + driver + ", url=" + url + ", password=" + password + ", user=" + user + "]";
	}
	
	

}
