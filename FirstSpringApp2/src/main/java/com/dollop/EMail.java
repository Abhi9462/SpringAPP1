package com.dollop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("com.dollop")
public class EMail{
	private String hostName;
	private String portNumber;
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}
	@Override
	public String toString() {
		return "EMail [hostName=" + hostName + ", portNumber=" + portNumber + "]";
	}

	

}
