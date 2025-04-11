package com.cmoconnect.backendweb.repository;

import com.cmoconnect.backendweb.model.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
    List<Abonnement> findByUtilisateurId(Long utilisateurId);
}
