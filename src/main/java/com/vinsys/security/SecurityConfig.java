package com.vinsys.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
	@Autowired

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(r -> r.requestMatchers("/login/**", "/errors/**", "/", "/index.html").permitAll());
		http.authorizeHttpRequests().anyRequest().authenticated();
		http.oauth2Login();
		http.csrf().disable();
//		http.exceptionHandling(e -> e.authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED)));
		return http.build();
	}

}
