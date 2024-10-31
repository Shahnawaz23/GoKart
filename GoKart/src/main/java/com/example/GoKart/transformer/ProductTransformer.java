package com.example.GoKart.transformer;

import com.example.GoKart.dto.request.ProductRequest;
import com.example.GoKart.dto.response.ProductResponse;
import com.example.GoKart.model.Enum.ProductStatus;
import com.example.GoKart.model.Product;

public class ProductTransformer {

    public static Product productRequestToProduct(ProductRequest productRequest) {

        return Product.builder()
                .productName(productRequest.getProductName())
                .price(productRequest.getPrice())
                .category(productRequest.getCategory())
                .quantity(productRequest.getQuantity())
                .productStatus(ProductStatus.AVAILABLE)
                .build();
    }

    public static ProductResponse productToProductResponse(Product product) {

        return ProductResponse.builder()
                .productName(product.getProductName())
                .price(product.getPrice())
                .category(product.getCategory())
                .quantity(product.getQuantity())
                .productStatus(product.getProductStatus())
                .seller(SellerTransformer.sellerToSellerResponse(product.getSeller()))
                .build();
    }
}
