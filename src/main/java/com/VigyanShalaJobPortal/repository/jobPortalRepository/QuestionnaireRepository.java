package com.VigyanShalaJobPortal.repository.jobPortalRepository;

//import com.vigyanshaala.entity.jobPortalEntity.Questionnaire;
import com.VigyanShalaJobPortal.entity.jobPortalEntity.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire, String> {
}
