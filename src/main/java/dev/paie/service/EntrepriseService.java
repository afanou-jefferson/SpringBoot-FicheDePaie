package dev.paie.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.paie.entite.Entreprise;
import dev.paie.repository.EntrepriseRepository;
import dev.paie.web.entreprise.EntrepriseRequestDto;

@Service
public class EntrepriseService {

	private EntrepriseRepository repoEntreprise;

	public EntrepriseService(EntrepriseRepository repoEntreprise) {
		this.repoEntreprise = repoEntreprise;
	}

	public Optional<Entreprise> recupererEntreprise(int id) {
		return repoEntreprise.findById(id);
	}

	public List<Entreprise> listerEntreprise() {
		return repoEntreprise.findAll();
	}

	@Transactional
	public Entreprise creerEntreprise(EntrepriseRequestDto dto) {
		return repoEntreprise.save(new Entreprise(dto));
	}

}
