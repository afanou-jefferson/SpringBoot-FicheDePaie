package dev.paie.service;

import org.springframework.stereotype.Service;

import dev.paie.repository.GradeRepository;

@Service
public class GradeService {

	private GradeRepository repoGrade;

	public GradeService(GradeRepository repoGrade) {
		this.repoGrade = repoGrade;
	}
}
