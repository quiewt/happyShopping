package com.wbz.service.imp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.wbz.dao.ProductRepository;
import com.wbz.entity.Product;
import com.wbz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wei on 2017/1/11.
 */
@Service("productService")
public class ProductServiceImp implements ProductService {

    @Autowired
    @Qualifier("productRepository")
    ProductRepository productRepository;

    public List<Product> getAllMenus() {
        List<Product> products = productRepository.findAll();
        return products;
    }
}
