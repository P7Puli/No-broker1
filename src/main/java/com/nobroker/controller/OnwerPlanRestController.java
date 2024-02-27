package com.nobroker.controller;

import com.nobroker.entity.OwnerPlan;
import com.nobroker.paylode.OwnerPlanDto;
import com.nobroker.service.OwnerPlanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ownerPaln")
public class OnwerPlanRestController {

    private OwnerPlanService ownerPlanService;

    public OnwerPlanRestController(OwnerPlanService ownerPlanService) {
        this.ownerPlanService = ownerPlanService;
    }
//save the records
    @PostMapping
    public ResponseEntity<OwnerPlanDto> createOwnerPlan(@RequestBody OwnerPlanDto ownerPlanDto){
        OwnerPlanDto dto = ownerPlanService.createOwnerPlans(ownerPlanDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @GetMapping
    public List<OwnerPlanDto> getAllOwnerPlans(){
       return ownerPlanService.getAllOwnerPlans();
    }

}
