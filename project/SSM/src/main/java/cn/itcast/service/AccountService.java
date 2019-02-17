package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    public void saveAccount(Account account);
}
