package com.example.GoKart.transformer;

import com.example.GoKart.dto.request.SellerRequest;
import com.example.GoKart.dto.response.SellerResponse;
import com.example.GoKart.model.Seller;

public class SellerTransformer {


    public static Seller sellerRequestToSeller(SellerRequest sellerRequest) {

        return Seller.builder()
                .name(sellerRequest.getName())
                .email(sellerRequest.getEmail())
                .pan(sellerRequest.getPan())
                .build();
    }


    public static SellerResponse sellerToSellerResponse(Seller seller) {
        return SellerResponse.builder()
                .name(seller.getName())
                .email(seller.getEmail())
                .build();
    }
}
