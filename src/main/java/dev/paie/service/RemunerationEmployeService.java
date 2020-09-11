package dev.paie.service;

import org.springframework.stereotype.Service;

import dev.paie.repository.RemunerationEmployeRepository;

@Service
public class RemunerationEmployeService {

	private RemunerationEmployeRepository repoRemuEmp;

	public RemunerationEmployeService(RemunerationEmployeRepository repoRemuEmp) {
		this.repoRemuEmp = repoRemuEmp;
	}
}
