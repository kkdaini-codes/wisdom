package com.kkdaini.wisdom.service;

import com.kkdaini.wisdom.bean.SysUser;
import com.kkdaini.wisdom.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Resource
    private SysUserMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = mapper.selectByUsername(username);
        List<SimpleGrantedAuthority> authorities=new ArrayList<>();
        Assert.notNull(user,"用户不存在");
        user.getRoles().forEach((role)->{
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        });
        return new User(user.getUsername(),user.getPassword(),authorities);
    }
}
