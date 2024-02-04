package com.VigyanShalaJobPortal.repository.jobPortalRepository;

//import com.vigyanshaala.entity.jobPortalEntity.JobLocation;
import com.VigyanShalaJobPortal.entity.jobPortalEntity.JobLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobLocationRepository extends JpaRepository<JobLocation,String> {
}
