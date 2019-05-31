package me.bezgerts.VkFriendsChecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication

public class VkFriendsCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VkFriendsCheckerApplication.class, args);
	}


}
