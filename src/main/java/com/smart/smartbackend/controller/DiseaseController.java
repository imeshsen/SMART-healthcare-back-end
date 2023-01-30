package com.smart.smartbackend.controller;

import com.smart.smartbackend.entity.Diseases;
import com.smart.smartbackend.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/v1/diseases")
@CrossOrigin
public class DiseaseController {
    @Autowired
    public DiseaseService diseaseService;

}
