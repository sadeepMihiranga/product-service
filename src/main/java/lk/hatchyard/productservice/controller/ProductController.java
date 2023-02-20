package lk.hatchyard.productservice.controller;

import lk.hatchyard.productservice.entity.Product;
import lk.hatchyard.productservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        log.info("saveProduct method invoked");
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable("id") Long productId) {
        log.info("findProductById method invoked");
        return productService.getProductById(productId);
    }
}
