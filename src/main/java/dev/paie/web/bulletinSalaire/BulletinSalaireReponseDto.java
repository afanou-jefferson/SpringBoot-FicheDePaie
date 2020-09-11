package dev.paie.web.bulletinSalaire;

import dev.paie.entite.BulletinSalaire;

public class BulletinSalaireReponseDto extends BulletinSalaireRequestDto {

	private int id;

	public BulletinSalaireReponseDto(BulletinSalaire bulletin) {
		this.id = bulletin.getId();
		this.setIdRemuEmploye(bulletin.getRemunerationEmploye().getId());
		this.setIdPeriode(bulletin.getPeriode().getId());
		this.setPrimeExceptionelle(bulletin.getPrimeExceptionnelle());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
