package com.product.repository;

import com.product.module.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productrepository extends JpaRepository<product, Long>
{
}
