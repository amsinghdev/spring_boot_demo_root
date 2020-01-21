package com.amit.service;

import com.amit.entity.Application;
import com.amit.exception.ApplicationNotFoundException;
import com.amit.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService
{
    private final ApplicationRepository applicationRepository;

    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public List<Application> listApplications() {
        return (List<Application>)applicationRepository.findAll();
    }

    @Override
    public  Application getApplication(long id) {
        Optional<Application>  optionalApplication = applicationRepository.findById(id);
        if(optionalApplication.isPresent())
            return  optionalApplication.get();
        else
            throw new ApplicationNotFoundException("Application not Found");
    }
}
