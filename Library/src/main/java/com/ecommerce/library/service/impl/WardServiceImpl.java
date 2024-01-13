package com.ecommerce.library.service.impl;

import com.ecommerce.library.model.Ward;
import com.ecommerce.library.repository.WardRepository;
import com.ecommerce.library.service.WardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WardServiceImpl implements WardService {
    private final WardRepository wardRepository;

    @Override
    public List<Ward> findAll() {
        return wardRepository.findAll();
    }
}