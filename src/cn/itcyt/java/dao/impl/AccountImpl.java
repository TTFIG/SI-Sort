package cn.itcyt.java.dao.impl;

import cn.itcyt.java.dao.AccountMapper;

public class AccountImpl implements AccountMapper {
    @Override
    public void saveAccount() {
        System.out.println("success~");
    }
}
