package cn.itcast.test;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void findById(){
        //获取spring容器--ac
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationConText.xml");
        //从容器中获取代理对象
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        //调用方法
        Items itemsdao = itemsDao.findById(1);
        System.out.println(itemsdao);
    }
}
