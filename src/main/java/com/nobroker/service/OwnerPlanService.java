package com.nobroker.service;

import com.nobroker.paylode.OwnerPlanDto;

import java.util.List;

public interface OwnerPlanService {

    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto);

    List<OwnerPlanDto> getAllOwnerPlans();
}
