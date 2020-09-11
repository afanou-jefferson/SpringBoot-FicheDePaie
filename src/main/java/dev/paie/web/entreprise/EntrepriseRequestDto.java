package dev.paie.web.entreprise;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EntrepriseRequestDto {

	@NotBlank
	@Size(min = 2)
	private String siret;

	@NotBlank
	@Size(min = 2)
	private String denomination;

	private String adresse;
	private String urssaf;
	private String codeNaf;

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
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

}
