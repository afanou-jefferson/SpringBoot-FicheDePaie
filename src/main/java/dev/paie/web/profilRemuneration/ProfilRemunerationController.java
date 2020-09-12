package dev.paie.web.profilRemuneration;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.service.ProfilRemunerationService;

@RestController
@RequestMapping("profil")
public class ProfilRemunerationController {

	private ProfilRemunerationService pService;

	public ProfilRemunerationController(ProfilRemunerationService pService) {
		this.pService = pService;
	}

	@GetMapping("all")
	public ResponseEntity<?> getAllProfils() {

		List<ProfilRemunerationRequestDto> listeP = pService.listerProfils();

		if (!listeP.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).header("message", "Profils trouvés").body(listeP);

		} else { // listeE.isEmpty = true
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aucun Profil enregistré en BDD ");
		}

	}
}
