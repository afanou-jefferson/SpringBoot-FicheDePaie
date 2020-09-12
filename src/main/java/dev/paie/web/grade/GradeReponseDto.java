package dev.paie.web.grade;

import dev.paie.entite.Grade;

public class GradeReponseDto extends GradeRequestDto {

	private int id;

	public GradeReponseDto(Grade grade) {
		this.id = grade.getId();
		this.setCode(grade.getCode());
		this.setNbHeuresBase(grade.getNbHeuresBase());
		this.setTauxBase(grade.getTauxBase());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
