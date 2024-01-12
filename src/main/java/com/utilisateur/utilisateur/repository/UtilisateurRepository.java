package com.utilisateur.utilisateur.repository;

import com.utilisateur.utilisateur.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
