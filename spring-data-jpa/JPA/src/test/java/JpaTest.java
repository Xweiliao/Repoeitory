import cn.itcast.Customer;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {
    @Test
    public void test01(){
        //获取EntityManagerFactory
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");
        //获得实体管理类
        EntityManager em = factory.createEntityManager();
        //获取事物
        EntityTransaction tx= em.getTransaction();
        //开启事务
        tx.begin();
        //准备数据
        Customer c = new Customer();
        c.setCustName("传智播客");
        //保存操作
        em.persist(c);
        //提交事务
        tx.commit();
        //释放资源
        em.close();
        factory.close();
    }
}
