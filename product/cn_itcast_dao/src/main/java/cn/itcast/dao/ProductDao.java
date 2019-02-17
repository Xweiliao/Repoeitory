package cn.itcast.dao;

import cn.itcast.product.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface ProductDao {

    //查询所有的产品信息
    @Select("select * from product")
    public List<Product> findAll() throws Exception;

}
