package com.utilisateur.utilisateur.controller;

import com.utilisateur.utilisateur.entity.Utilisateur;
import com.utilisateur.utilisateur.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;


@RestController
@RequestMapping("/api/utilisateurs")
@CrossOrigin("*")
public class UtilisateurController {

    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurController(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @GetMapping
    public List<Utilisateur> listeUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @PostConstruct
    private void Init(){
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(1L);
        utilisateur.setNom("CHERNI");
        utilisateur.setPrenom("Hichem");
        utilisateurRepository.save(utilisateur);
    }
}
