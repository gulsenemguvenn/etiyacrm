package com.etiya.catalogservice.services.dtos.requests.productProductOfferRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductProductOfferRequest {
    private String productId;
    private String productOfferId;

}
