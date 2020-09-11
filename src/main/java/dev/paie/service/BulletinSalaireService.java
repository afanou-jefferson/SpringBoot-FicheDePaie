package dev.paie.service;

import org.springframework.stereotype.Service;

import dev.paie.repository.BulletinSalaireRepository;

@Service
public class BulletinSalaireService {

	private BulletinSalaireRepository repoBulletin;

	public BulletinSalaireService(BulletinSalaireRepository repoBulletin) {
		this.repoBulletin = repoBulletin;
	}

}
