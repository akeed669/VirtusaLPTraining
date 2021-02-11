package com.akeed.gunstore.auth.authserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {

    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("akeed").password(passwordEncoder.encode("akeedpass")).roles("USER","ADMIN","MANAGER").authorities("CAN_READ","CAN_WRITE","CAN_DESTROY").
                and().withUser("thaqeeb").password(passwordEncoder.encode("tuckpass")).roles("USER").authorities("CAN_READ","CAN_WRITE");
    }
}
