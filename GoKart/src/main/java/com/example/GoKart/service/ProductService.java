package com.example.GoKart.service;

import com.example.GoKart.dto.request.ProductRequest;
import com.example.GoKart.dto.response.ProductResponse;
import com.example.GoKart.exception.SellerNotFoundException;
import com.example.GoKart.model.Product;
import com.example.GoKart.model.Seller;
import com.example.GoKart.repo.SellerRepository;
import com.example.GoKart.transformer.ProductTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    SellerRepository sellerRepository;

    public ProductResponse addProduct(ProductRequest productRequest,String sellerEmail) {

        Optional<Seller> sellerOptional = sellerRepository.findByEmail(sellerEmail);

        if(sellerOptional.isEmpty()) {
             throw new SellerNotFoundException("Invalid Seller Email");
        }

        Seller seller = sellerOptional.get();

        Product product = ProductTransformer.productRequestToProduct(productRequest);
        product.setSeller(seller);

        seller.getProducts().add(product);

        Seller savedSeller =  sellerRepository.save(seller);   //it save both seller and product

        int size = seller.getProducts().size();
        Product savedProduct = savedSeller.getProducts().get(size - 1);
        return ProductTransformer.productToProductResponse(savedProduct);
    }
}
