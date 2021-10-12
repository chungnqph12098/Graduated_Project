package com.vn.Sercurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.endpoint.DefaultAuthorizationCodeTokenResponseClient;
import org.springframework.security.oauth2.client.endpoint.OAuth2AccessTokenResponseClient;
import org.springframework.security.oauth2.client.endpoint.OAuth2AuthorizationCodeGrantRequest;
import org.springframework.security.oauth2.client.web.AuthorizationRequestRepository;
import org.springframework.security.oauth2.client.web.HttpSessionOAuth2AuthorizationRequestRepository;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;

@Configuration
public class SecutiryConfig extends WebSecurityConfigurerAdapter {

	@Override
    public void configure(HttpSecurity http) throws Exception {

        http
                .antMatcher("/**").authorizeRequests()
                .antMatchers("/login", "/notlogin").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login()
                .defaultSuccessUrl("/login/success")
                ;
        
//        http.oauth2Login()
//        	.loginPage("/login")
//        	.defaultSuccessUrl("/login/success")
//        	.failureUrl("/login/fail")
//        	.authorizationEndpoint().baseUri("/oauth2/authorization")
//        							.authorizationRequestRepository(getRepository())
//        	.and().tokenEndpoint().accessTokenResponseClient(getToken());
//
//	@Bean
//	public AuthorizationRequestRepository<OAuth2AuthorizationRequest> getRepository(){
//        	return new HttpSessionOAuth2AuthorizationRequestRepository();
//        }
//	
//	
//	@Bean
//	public OAuth2AccessTokenResponseClient<OAuth2AuthorizationCodeGrantRequest> getToken(){
//		return new DefaultAuthorizationCodeTokenResponseClient();
//	}
	
}	
}