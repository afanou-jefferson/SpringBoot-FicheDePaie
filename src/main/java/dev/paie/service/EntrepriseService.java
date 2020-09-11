package dev.paie.service;

import org.springframework.stereotype.Service;

import dev.paie.repository.EntrepriseRepository;

@Service
public class EntrepriseService {

	private EntrepriseRepository repoEntreprise;

	public EntrepriseService(EntrepriseRepository repoEntreprise) {
		this.repoEntreprise = repoEntreprise;
	}

}
