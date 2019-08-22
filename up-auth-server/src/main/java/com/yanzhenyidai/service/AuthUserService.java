package com.yanzhenyidai.service;

import com.yanzhenyidai.domain.User;
import com.yanzhenyidai.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author tanzhen.frank
 * @since 1.0.0
 */
@Service(value = "userDetailService")
public class AuthUserService implements UserDetailsService {

    @Autowired
    private UserFacade userFacade;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User user = userFacade.queryByName(s);

        if (user == null) {
            throw new UsernameNotFoundException("username is not exist," + s);
        }

        // userDetails 实体中的属性:启用,锁定,凭证过期,用户过期,权限

        boolean enabled = true;
        boolean accountNonLocked = true;
        boolean credentialsNonExpired = true;
        boolean accountNonExpired = true;

        Set<GrantedAuthority> set = new HashSet<GrantedAuthority>();

        org.springframework.security.core.userdetails.User usr =
                new org.springframework.security.core.userdetails.User
                        (user.getName(), user.getPassword(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, set);

        return usr;
    }
}

