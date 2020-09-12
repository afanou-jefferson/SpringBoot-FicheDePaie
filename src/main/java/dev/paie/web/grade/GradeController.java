package dev.paie.web.grade;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.service.GradeService;

@RestController
@RequestMapping("grade")
public class GradeController {

	private GradeService gService;

	public GradeController(GradeService gService) {
		this.gService = gService;
	}

	@GetMapping("all")
	public ResponseEntity<?> getAllGrades() {

		List<GradeRequestDto> listeG = gService.listerGrades();

		if (!listeG.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).header("message", "Grades trouvés").body(listeG);

		} else { // listeE.isEmpty = true
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aucun Grade enregistré en BDD ");
		}

	}

}
