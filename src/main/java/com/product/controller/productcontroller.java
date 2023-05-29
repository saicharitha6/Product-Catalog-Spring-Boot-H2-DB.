package com.product.controller;
import java.util.List;
import com.product.module.product;
import com.product.service.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class productcontroller {
    @Autowired
    private productservice productservice;

    @GetMapping("/product")
    private ResponseEntity<List<product>> getAllProducts() {
        return ResponseEntity.ok().body(this.productservice.getproducts());
    }

    @GetMapping("/product/{product_id}")
    private product getProductById(@PathVariable long product_id) {
        return this.productservice.getProductById(product_id);
    }

    @PostMapping("/product")
    private ResponseEntity<product> savProduct(@RequestBody product product) {
        return ResponseEntity.ok().body(this.productservice.createproduct(product));
    }

    @PutMapping("/product/{product_id}")
    private ResponseEntity<product> updateProduct(@PathVariable long product_id,@RequestBody product product) {
        product.setProduct_id(product_id);
        return ResponseEntity.ok().body(this.productservice.updateproduct(product));
    }

    @DeleteMapping("/product/{product_id}")
    private HttpStatus deleteProduct(@PathVariable long product_id) {
        this.productservice.deleteProduct(product_id);
        return HttpStatus.OK;
    }

}

