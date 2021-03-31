package edu.tcu.cs.hogwartsonlinestore.dao;

import edu.tcu.cs.hogwartsonlinestore.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
