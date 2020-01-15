package com.codegym.cms.service.Impl;

import com.codegym.cms.model.Sectors;
import com.codegym.cms.repository.SectorsRepository;
import com.codegym.cms.service.SectorsService;
import org.springframework.beans.factory.annotation.Autowired;

public class SectorsServiceImpl implements SectorsService {

    @Autowired
    SectorsRepository sectorsRepository;

    @Override
    public Iterable<Sectors> findAll() {
        return sectorsRepository.findAll();
    }
}
