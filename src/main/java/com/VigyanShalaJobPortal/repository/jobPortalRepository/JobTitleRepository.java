package com.VigyanShalaJobPortal.repository.jobPortalRepository;

//import com.vigyanshaala.entity.jobPortalEntity.JobTitle;
import com.VigyanShalaJobPortal.entity.jobPortalEntity.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleRepository extends JpaRepository<JobTitle,String> {
}
