package com.VigyanShalaJobPortal.service.jobPortalService;
import org.springframework.http.ResponseEntity;

public interface StudentServices {
    ResponseEntity getAllJobs();
    ResponseEntity getJobByID(String id);

    ResponseEntity getActiveJobs(Integer pageNumber);

}
