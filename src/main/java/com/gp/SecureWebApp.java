/**
 * 
 */
package com.gp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author GANESH
 *
 */
@SpringBootApplication
@EnableResourceServer
public class SecureWebApp {

	/**
	 * 
	 */
	public SecureWebApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SecureWebApp.class, args);


	}

}
