package com.VigyanShalaJobPortal.repository.jobPortalRepository;

import com.VigyanShalaJobPortal.entity.jobPortalEntity.Job;
//import com.vigyanshaala.entity.jobPortalEntity.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomJobRepository {
    Page<Job> fetchAll(JobFilter filterParams, Pageable p);
}
