package dev.paie.web.entreprise;

import dev.paie.entite.Entreprise;

public class EntrepriseReponseDto extends EntrepriseRequestDto {

	private int id;

	public EntrepriseReponseDto(Entreprise entreprise) {
		this.id = entreprise.getId();
		this.setSiret(entreprise.getSiret());
		this.setDenomination(entreprise.getDenomination());
		this.setAdresse(entreprise.getAdresse());
		this.setUrssaf(entreprise.getUrssaf());
		this.setCodeNaf(entreprise.getCodeNaf());
	}

	public int getID() {
		return this.id;
	}

	public void setID(int idParam) {
		this.id = idParam;
	}

}
