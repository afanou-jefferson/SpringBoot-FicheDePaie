package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entite.Entreprise;

public interface ProfilRemunerationRepository extends JpaRepository<Entreprise, Integer> {

}
