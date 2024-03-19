package com.project.loan.service;

import com.project.loan.dto.TermsDTO.Request;
import com.project.loan.dto.TermsDTO.Response;

import java.util.List;

public interface TermsService {

    Response create(Request request);

    List<Response> getAll();
}
