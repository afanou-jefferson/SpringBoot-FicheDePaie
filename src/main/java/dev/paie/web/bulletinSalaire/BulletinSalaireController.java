package dev.paie.web.bulletinSalaire;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.service.BulletinSalaireService;

@RestController
@RequestMapping("bulletin")
public class BulletinSalaireController {

	private BulletinSalaireService bService;

	public BulletinSalaireController(BulletinSalaireService bService) {
		super();
		this.bService = bService;
	}

	@GetMapping("all")
	public ResponseEntity<?> getAllBulletins() {

		List<BulletinSalaireRequestDto> listeB = bService.listerBulletins();

		if (!listeB.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).header("message", "Bulletins trouvés").body(listeB);

		} else { // listeE.isEmpty = true
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aucun bulletin enregistré en BDD ");
		}

	}

}
