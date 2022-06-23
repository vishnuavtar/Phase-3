package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//authentication
@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// chain of config
	auth.inMemoryAuthentication()
	.withUser("admin")
	.password("admin")
	.roles("ADMIN")
	.and()
	.withUser("user")
	.password("user")
	.roles("USER");
	
	}

@Bean
public PasswordEncoder getpassword() {
	
	//dont change the password
	return NoOpPasswordEncoder.getInstance();
}
	

//authorization
@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests()
	.antMatchers("/admin").hasRole("ADMIN")
	.antMatchers("/user").hasRole("USER")
	.antMatchers("/user").hasRole("ADMIN")
	.antMatchers("/").permitAll().and().formLogin();

}
}
