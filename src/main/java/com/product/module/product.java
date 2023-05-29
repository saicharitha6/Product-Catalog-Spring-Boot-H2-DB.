package com.product.module;

import javax.persistence.*;

@Entity
@Table
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long product_id;
    @Column(name="product_Name")
    private  String product_Name;
    @Column(name="noOfProducts")
    private long noOfProducts;
    @Column(name="quantity")
    private  long quantity;
	
    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public long getNoOfProducts() {
        return noOfProducts;
    }

    public void setNoOfProducts(long noOfProducts) {
        this.noOfProducts = noOfProducts;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
