package cn.itcast.controller;

import cn.itcast.product.domain.Product;
import cn.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/product")
public class controller {
    @Autowired
    private ProductService productService;

    //查询全部产品
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        return null;

    }
}
