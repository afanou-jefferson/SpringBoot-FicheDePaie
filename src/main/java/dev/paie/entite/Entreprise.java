package dev.paie.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import dev.paie.web.entreprise.EntrepriseRequestDto;

@Entity
public class Entreprise {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String siret;
	private String denomination;
	private String adresse;
	private String urssaf;
	private String codeNaf;

	public Entreprise() {
	}

	public Entreprise(EntrepriseRequestDto dto) {
		super();
		this.siret = dto.getSiret();
		this.denomination = dto.getDenomination();
		this.adresse = dto.getAdresse();
		this.urssaf = dto.getUrssaf();
		this.codeNaf = dto.getCodeNaf();
	}

	public Entreprise(String siret, String denomination, String adresse, String urssaf, String codeNaf) {
		super();
		this.siret = siret;
		this.denomination = denomination;
		this.adresse = adresse;
		this.urssaf = urssaf;
		this.codeNaf = codeNaf;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getUrssaf() {
		return urssaf;
	}

	public void setUrssaf(String urssaf) {
		this.urssaf = urssaf;
	}

	public String getCodeNaf() {
		return codeNaf;
	}

	public void setCodeNaf(String codeNaf) {
		this.codeNaf = codeNaf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
