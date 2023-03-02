package com.smart.smartbackend.controller;

import com.smart.smartbackend.entity.Specialist;
import com.smart.smartbackend.service.SpecialistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("api/v1/specialist")
@CrossOrigin
public class SpecialistController {
    @Autowired
    SpecialistService specialistService;

    @PostMapping("/save")
    public String saveSpecialist(@RequestBody Specialist specialist) throws ExecutionException, InterruptedException {
        return  specialistService.save(specialist);
    }

    @GetMapping("/andrologists")
    public List<Specialist> getAndrologists() throws ExecutionException, InterruptedException {
        return specialistService.getAllAndrologists();
    }

    @GetMapping("/cardiologists")
    public List<Specialist> getCardiologists() throws ExecutionException, InterruptedException {
        return specialistService.getAllCardiologists();
    }

    @GetMapping("/gastroenteologists")
    public List<Specialist> getGastroenteologists() throws ExecutionException, InterruptedException {
        return specialistService.getAllGastroenteologists();
    }

    @GetMapping("/gynocologists")
    public List<Specialist> getGynocologists() throws ExecutionException, InterruptedException {
        return specialistService.getAllGynocologists();
    }

    @GetMapping("/pulmonologists")
    public List<Specialist> getPulmonologists() throws ExecutionException, InterruptedException {
        return specialistService.getAllPulmonologists();
    }

    @GetMapping("/urologists")
    public List<Specialist> getUrologists() throws ExecutionException, InterruptedException {
        return specialistService.getAllUrologists();
    }
}
