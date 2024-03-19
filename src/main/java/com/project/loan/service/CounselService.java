package com.project.loan.service;

import com.project.loan.dto.CounselDTO.Request;
import com.project.loan.dto.CounselDTO.Response;

public interface CounselService {

    Response create(Request request);

    Response get(Long counselId);

    Response update(Long counselId, Request request);

    void delete(Long counselId);

}
