package com.wym.server;

public interface StudentsService {

    /**
     * 获取当前用户名称
     * @return
     */
    public String getName();

    /**
     * 获取当前用户年龄
     * @return
     */
    public Integer getAge();
}
