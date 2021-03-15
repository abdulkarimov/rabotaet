package com.itstep.restserver.service;

import com.itstep.restserver.entity.DbAcc;
import com.itstep.restserver.repository.AccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccServiceImpl implements AccService {

    @Autowired
    private AccRepository accRepository;


    @Override
    public List<DbAcc> getAllAcc() {
        return accRepository.findAll();
    }
}
