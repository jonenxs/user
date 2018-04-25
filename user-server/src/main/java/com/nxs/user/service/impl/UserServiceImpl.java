package com.nxs.user.service.impl;

import com.nxs.user.dataobject.UserInfo;
import com.nxs.user.repository.UserInfoRepository;
import com.nxs.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoRepository.findByOpenid(openid);
    }
}
