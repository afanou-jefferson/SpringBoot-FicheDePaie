package dev.paie.web.grade;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class GradeRequestDto {

	@NotNull
	private String code;

	@NotNull
	private BigDecimal nbHeuresBase;

	@NotNull
	private BigDecimal tauxBase;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getNbHeuresBase() {
		return nbHeuresBase;
	}

	public void setNbHeuresBase(BigDecimal nbHeuresBase) {
		this.nbHeuresBase = nbHeuresBase;
	}

	public BigDecimal getTauxBase() {
		return tauxBase;
	}

	public void setTauxBase(BigDecimal tauxBase) {
		this.tauxBase = tauxBase;
	}

}
