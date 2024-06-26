package com.etiya.catalogservice.controllers;

import com.etiya.catalogservice.services.abstracts.CatalogProductOfferService;
import com.etiya.catalogservice.services.dtos.requests.catalogProductOfferRequests.CreateCatalogProductOfferRequest;
import com.etiya.catalogservice.services.dtos.requests.catalogProductOfferRequests.UpdateCatalogProductOfferRequest;
import com.etiya.catalogservice.services.dtos.responses.catalogProductOfferResponses.*;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin()
@RequestMapping("api/v1/catalog-product-offers")

public class CatalogProductOfferController {
    private CatalogProductOfferService catalogProductOfferService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Add")
    public CreatedCatalogProductOfferResponse add(@Valid @RequestBody CreateCatalogProductOfferRequest createCatalogProductOfferRequest) {
        return catalogProductOfferService.add(createCatalogProductOfferRequest);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Update")
    public UpdatedCatalogProductOfferResponse update(@Valid @RequestBody UpdateCatalogProductOfferRequest updateCatalogProductOfferRequest, @PathVariable String id) {
        return catalogProductOfferService.update(updateCatalogProductOfferRequest, id);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "getAll")
    public List<GetAllCatalogProductOfferResponse> getAll() {
        return catalogProductOfferService.getAll();
    }

    @GetMapping("/get-by-product-offer-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "getById")
    public List<GetCatalogProductOfferResponse> getAllByProductOfferId(@PathVariable String id) {
        return catalogProductOfferService.findAllByProductOfferId(id);
    }

    @GetMapping("/get-product-offer/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "getById")
    public GetCatalogProductOfferResponse getByProductOfferId(@PathVariable String id) {
        return catalogProductOfferService.findByProductOfferId(id);
    }

    @GetMapping("/{catalogId}")
    @ResponseStatus(HttpStatus.OK)
    public List<GetCatalogProductOfferResponse> getAllById(@PathVariable String catalogId){
        return catalogProductOfferService.findAllByCatalogId(catalogId);
    }

    @GetMapping("/get-catalog-product/{catalogId}")
    @ResponseStatus(HttpStatus.OK)
    public GetCatalogProductOfferResponse getById(@PathVariable String catalogId){
        return catalogProductOfferService.findByCatalogId(catalogId);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete")
    @ResponseStatus(HttpStatus.OK)
    public DeletedCatalogProductOfferResponse delete(@PathVariable String id) {
        return catalogProductOfferService.delete(id);
    }
}
