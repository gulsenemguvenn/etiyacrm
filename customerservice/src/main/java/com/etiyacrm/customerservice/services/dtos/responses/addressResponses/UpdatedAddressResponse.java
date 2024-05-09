package com.etiyacrm.customerservice.services.dtos.responses.addressResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdatedAddressResponse {
    private String id;
    private String description;
    private String street;
    private int flatNumber;
    private String cityId;
    private String districtId;
    private String customerId;
}
