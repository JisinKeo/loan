package com.project.loan.service;

import com.project.loan.dto.ApplicationDTO.AcceptTerms;
import com.project.loan.dto.ApplicationDTO.Response;
import com.project.loan.dto.ApplicationDTO.Request;
public interface ApplicationService {

    Response create(Request request);

    Response get(Long applicationId);

    Response update(Long applicationId, Request request);

    void delete(Long applicationId);

    Boolean acceptTerms(Long applicationId, AcceptTerms request);

    Response contract(Long applicationId);

}
