package com.login.demologin.service.impl;

import com.login.demologin.entity.User;
import com.login.demologin.mapper.UserMapper;
import com.login.demologin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Teng
 * @since 2024-05-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
