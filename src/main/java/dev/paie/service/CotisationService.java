package dev.paie.service;

import org.springframework.stereotype.Service;

import dev.paie.repository.CotisationRepository;

@Service
public class CotisationService {

	private CotisationRepository repoCotisation;

	public CotisationService(CotisationRepository repoCotisation) {
		this.repoCotisation = repoCotisation;
	}
}
