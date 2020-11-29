package com.wym.server.impl;

import com.wym.server.StudentsService;
import org.springframework.stereotype.Service;

import java.util.concurrent.locks.ReentrantLock;

@Service
public class StudentsServiceImpl implements StudentsService {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public Integer getAge() {

        ReentrantLock reentrantLock = null;
        ThreadLocalMap threadLocalMap = null;
        ThreadLocal threadLocal = new ThreadLocal();
        return null;
    }
}
