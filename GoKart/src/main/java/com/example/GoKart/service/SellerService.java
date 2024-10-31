package com.example.GoKart.service;

import com.example.GoKart.dto.request.SellerRequest;
import com.example.GoKart.dto.response.SellerResponse;
import com.example.GoKart.model.Seller;
import com.example.GoKart.repo.SellerRepository;
import com.example.GoKart.transformer.CustomerTransformer;
import com.example.GoKart.transformer.SellerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;

    public SellerResponse addSeller(SellerRequest sellerRequest) {

        Seller seller = SellerTransformer.sellerRequestToSeller(sellerRequest);

        Seller savedSeller  = sellerRepository.save(seller);

        return SellerTransformer.sellerToSellerResponse(savedSeller);

    }
}
