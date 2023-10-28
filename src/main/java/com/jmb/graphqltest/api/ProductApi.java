package com.jmb.graphqltest.api;

import com.jmb.graphqltest.model.Product;
import com.jmb.graphqltest.repository.ProductRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductApi {

    private final ProductRepository productRepository;

    public ProductApi(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @QueryMapping
    Iterable<Product> products() {
        return productRepository.findAll();
    }
}
