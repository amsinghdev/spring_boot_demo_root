package com.amit.service;

import com.amit.entity.Application;

import java.util.List;
import java.util.Optional;

public interface ApplicationService
{
    List<Application> listApplications();

    Application getApplication(long id);
}
