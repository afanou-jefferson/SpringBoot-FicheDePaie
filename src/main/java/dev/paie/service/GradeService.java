package dev.paie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.paie.entite.Grade;
import dev.paie.repository.GradeRepository;
import dev.paie.web.grade.GradeReponseDto;
import dev.paie.web.grade.GradeRequestDto;

@Service
public class GradeService {

	private GradeRepository repoGrade;

	public GradeService(GradeRepository repoGrade) {
		this.repoGrade = repoGrade;
	}

	public List<GradeRequestDto> listerGrades() {

		List<GradeRequestDto> listeDto = new ArrayList();

		List<Grade> listeGrade = repoGrade.findAll();

		for (Grade grade : listeGrade) {
			listeDto.add(new GradeReponseDto(grade));
		}
		return listeDto;
	}
}
