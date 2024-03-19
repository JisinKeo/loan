package com.project.loan.service;

import com.project.loan.dto.EntryDTO.*;

public interface EntryService {

    Response create(Long applicationId, Request request);

    Response get(Long applicationId);

    UpdateResponse update(Long entryId, Request request);

    void delete(Long entryId);

}
