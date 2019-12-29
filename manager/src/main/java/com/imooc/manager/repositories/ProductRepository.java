package com.imooc.manager.repositories;

import com.imooc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Xyong
 * @since: 2019/11/4
 */
public interface ProductRepository extends CrudRepository<Product,String>, JpaRepository<Product,String>, JpaSpecificationExecutor<Product> {
}
