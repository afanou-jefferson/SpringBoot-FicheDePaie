package dev.paie.web.remunerationEmploye;

import javax.validation.constraints.NotNull;

public class RemunerationEmployeRequestDto {

	@NotNull
	private String matricule;

	@NotNull
	private int idEntreprise;

	@NotNull
	private int idProfilRemu;

	@NotNull
	private int idGrade;

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public int getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(int idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public int getIdProfilRemu() {
		return idProfilRemu;
	}

	public void setIdProfilRemu(int idProfilRmu) {
		this.idProfilRemu = idProfilRmu;
	}

	public int getIdGrade() {
		return idGrade;
	}

	public void setIdGrade(int idGrade) {
		this.idGrade = idGrade;
	}
}
