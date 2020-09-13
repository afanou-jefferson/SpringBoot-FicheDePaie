package dev.paie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.paie.entite.BulletinSalaire;
import dev.paie.repository.BulletinSalaireRepository;
import dev.paie.web.bulletinSalaire.BulletinSalaireReponseDto;

@Service
public class BulletinSalaireService {

	private BulletinSalaireRepository repoBulletin;

	public BulletinSalaireService(BulletinSalaireRepository repoBulletin) {
		this.repoBulletin = repoBulletin;
	}

	public List<BulletinSalaireReponseDto> listerBulletins() {

		List<BulletinSalaireReponseDto> listeDto = new ArrayList();

		List<BulletinSalaire> listeB = repoBulletin.findAll();

		for (BulletinSalaire b : listeB) {
			listeDto.add(new BulletinSalaireReponseDto(b));
		}
		return listeDto;
	}

}
