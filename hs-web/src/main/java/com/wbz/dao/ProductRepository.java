package com.wbz.dao;

import com.wbz.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wei on 2017/1/11.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
