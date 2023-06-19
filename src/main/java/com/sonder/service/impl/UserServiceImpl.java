package com.sonder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sonder.Entity.User;
import com.sonder.mapper.UserMapper;
import com.sonder.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
