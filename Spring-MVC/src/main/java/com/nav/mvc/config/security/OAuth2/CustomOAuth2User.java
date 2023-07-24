package com.nav.mvc.config.security.OAuth2;

import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class CustomOAuth2User implements OAuth2User {

	 private String oauth2ClientName;
	private OAuth2User oAuth2User;
	
	
	public CustomOAuth2User(OAuth2User oAuth2User,String oauth2ClientName) {
		super();
		this.oauth2ClientName = oauth2ClientName;
		this.oAuth2User = oAuth2User;
	}

	@Override
	public Map<String, Object> getAttributes() {
		return oAuth2User.getAttributes();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return oAuth2User.getAuthorities();
	}

	@Override
	public String getName() {
		return oAuth2User.getAttribute("name");
	}
	public String getOauth2ClientName() {
        return this.oauth2ClientName;
    }
}
