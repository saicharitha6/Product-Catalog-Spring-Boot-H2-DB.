package com.product.service;
import javax.transaction.Transactional;
import com.product.exception.prodException;
import com.product.module.product;
import com.product.repository.productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class productserviceImp implements productservice {
    @Autowired
    private productrepository prodrepo;

    @Override
    public product createproduct(product p1) {
        return prodrepo.save(p1);
    }

    @Override
    public product updateproduct(product p1) {

        Optional<product> prodObj = this.prodrepo.findById(p1.getProduct_id());
        if(prodObj.isPresent()){
            product prodUpdate = prodObj.get();
            prodUpdate.setNoOfProducts(p1.getNoOfProducts());
            prodUpdate.setProduct_id(p1.getProduct_id());
            prodUpdate.setProduct_Name(p1.getProduct_Name());
            prodUpdate.setQuantity(p1.getQuantity());
            return this.prodrepo.save(prodUpdate);
        }
        else{
            throw new prodException("product id not found"+ p1.getProduct_id());
        }
    }

    @Override
    public List<product> getproducts() {
        return this.prodrepo.findAll();
    }

    @Override
    public product getProductById(long product_id) {
        Optional<product> prodObj = this.prodrepo.findById(product_id);
        if(prodObj.isPresent()){
            return prodObj.get();
        }
        else{
            throw new prodException("productid not found"+ product_id);
        }
    }

    @Override
    public void deleteProduct(long product_id) {
        Optional<product> prodObj = this.prodrepo.findById(product_id);
        if(prodObj.isPresent()){
            this.prodrepo.deleteById(product_id);
        }
        else{
            throw new prodException("productid not found"+ product_id);
        }
    }
}
