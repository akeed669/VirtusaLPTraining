package com.akeed.gunstore.authserverdb.service;

import com.akeed.gunstore.authserverdb.model.AuthUserDetails;
import com.akeed.gunstore.authserverdb.model.User;
import com.akeed.gunstore.authserverdb.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<User> optionalUser = userDetailsRepository.findByUsername(name);
        optionalUser.orElseThrow(()-> new UsernameNotFoundException("Username or password is wrong"));
        UserDetails userDetails = new AuthUserDetails(optionalUser.get());
        new AccountStatusUserDetailsChecker().check(userDetails);
        return userDetails;
    }
}
