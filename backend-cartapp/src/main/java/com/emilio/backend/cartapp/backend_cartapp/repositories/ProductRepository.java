package com.emilio.backend.cartapp.backend_cartapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.emilio.backend.cartapp.backend_cartapp.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

} 