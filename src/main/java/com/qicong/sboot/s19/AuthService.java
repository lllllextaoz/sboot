package com.qicong.sboot.s19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * authservice
 *
 * @author gormanbeatrice
 * @create 2022 03 12 00:59
 */
@Service
public class AuthService {

    @Autowired
    AuthDao authDao;

    public String getPassword(String username){
        return authDao.getPassword(username);
    }
}
