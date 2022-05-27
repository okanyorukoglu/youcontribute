package com.okan.youcontribute.controllers;


import com.okan.youcontribute.controllers.request.CreateRepositoryRequest;
import com.okan.youcontribute.service.RepositoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/repositories")
public class RepositoryController {

    private final RepositoryService repositoryService;
    public RepositoryController(RepositoryService repositoryService){
        this.repositoryService = repositoryService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody CreateRepositoryRequest request){
        this.repositoryService.create(request.getUrl());
    }
}
