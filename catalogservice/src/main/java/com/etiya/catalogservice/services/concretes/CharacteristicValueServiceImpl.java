package com.etiya.catalogservice.services.concretes;

import com.etiya.catalogservice.services.abstracts.CharacteristicValueService;
import com.etiya.catalogservice.services.dtos.requests.characteristicValueRequests.CreateCharacteristicValueRequest;
import com.etiya.catalogservice.services.dtos.requests.characteristicValueRequests.UpdateCharacteristicValueRequest;
import com.etiya.catalogservice.services.dtos.responses.characteristicValueResponses.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CharacteristicValueServiceImpl implements CharacteristicValueService {
    @Override
    public CreatedCharacteristicValueResponse add(CreateCharacteristicValueRequest createCharacteristicValueRequest) {
        return null;
    }

    @Override
    public UpdatedCharacteristicValueResponse update(UpdateCharacteristicValueRequest updateCharacteristicValueRequest, String id) {
        return null;
    }

    @Override
    public List<GetAllCharacteristicValueResponse> getAll() {
        return null;
    }

    @Override
    public GetCharacteristicValueResponse getById(String id) {
        return null;
    }

    @Override
    public DeletedCharacteristicValueResponse delete(String id) {
        return null;
    }
}