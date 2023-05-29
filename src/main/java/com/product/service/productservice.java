package com.product.service;
import com.product.module.product;
import java.util.List;
public interface productservice {
    product createproduct(product p1);
    product updateproduct(product p1);
    List<product> getproducts();
    product getProductById(long product_id);
    void deleteProduct(long product_id);

}
