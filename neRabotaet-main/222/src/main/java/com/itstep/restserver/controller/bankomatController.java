package com.itstep.restserver.controller;
import com.itstep.restserver.entity.DbAcc;
import com.itstep.restserver.service.AccService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("api")

public class bankomatController {

    @Autowired
    private AccService service;

    @GetMapping("/getAllCityBankAccount")
    public List<DbAcc> getAcc() {
        return service.getAllAcc();
    }

}
