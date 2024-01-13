package com.ecommerce.library.service.impl;

import com.ecommerce.library.model.District;
import com.ecommerce.library.repository.DistrictRepository;
import com.ecommerce.library.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DistrictServiceImpl implements DistrictService {
    private final DistrictRepository districtRepository;

    @Override
    public List<District> findAll() {
        return districtRepository.findAll();
    }
}
