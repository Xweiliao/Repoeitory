package cn.itcast.test;

import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");//可以帮我们加载配置文件
        //获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        //调用方法
        as.findAll();
    }
}
