package dev.paie.service;

import org.springframework.stereotype.Service;

import dev.paie.repository.ProfilRemunerationRepository;

@Service
public class ProfilRemunerationService {

	private ProfilRemunerationRepository repoProfilRemu;

	public ProfilRemunerationService(ProfilRemunerationRepository repoProfilRemu) {
		this.repoProfilRemu = repoProfilRemu;
	}
}
