package com.project.loan.controller;

import com.project.loan.dto.ResponseDTO;
import com.project.loan.service.TermsService;
import com.project.loan.dto.TermsDTO.Response;
import com.project.loan.dto.TermsDTO.Request;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.project.loan.dto.ResponseDTO.ok;

@RequiredArgsConstructor
@RestController
@RequestMapping("/terms")
public class TermsController {

    private final TermsService termsService;

    @PostMapping
    public ResponseDTO<Response> create(@RequestBody Request request) {
        return ok(termsService.create(request));
    }

    @GetMapping
    public ResponseDTO<List<Response>> getAll(){
        return ok(termsService.getAll());
    }

}
