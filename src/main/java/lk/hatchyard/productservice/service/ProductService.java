package lk.hatchyard.productservice.service;

import lk.hatchyard.productservice.entity.Product;

public interface ProductService {

    Product saveProduct(Product product);

    Product getProductById(Long productId);
}
