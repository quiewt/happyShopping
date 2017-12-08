package com.wbz.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wbz.entity.Product;
import com.wbz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by wei on 2017/1/11.
 */
@Controller
@RequestMapping("/")
public class MenuController {

    @Autowired
    @Qualifier("productService")
    ProductService productService;

    @RequestMapping("getAllMenus")
    public @ResponseBody List<Product> getAllMenus(HttpServletRequest request,HttpServletResponse response){
        List<Product> products = productService.getAllMenus();
       // model.addAttribute("menus",result);
        return products;
    }
}
