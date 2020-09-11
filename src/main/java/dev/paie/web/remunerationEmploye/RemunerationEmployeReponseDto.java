package dev.paie.web.remunerationEmploye;

import dev.paie.entite.RemunerationEmploye;

public class RemunerationEmployeReponseDto extends RemunerationEmployeRequestDto {

	private int id;

	public RemunerationEmployeReponseDto(RemunerationEmploye remuEmp) {
		this.id = remuEmp.getId();
		this.setMatricule(remuEmp.getMatricule());
		this.setIdEntreprise(remuEmp.getEntreprise().getId());
		this.setIdProfilRmu(remuEmp.getProfilRemuneration().getId());
		this.setIdGrade(remuEmp.getGrade().getId());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
