package dev.paie.web.entreprise;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.entite.Entreprise;
import dev.paie.service.EntrepriseService;

@RestController
@RequestMapping("entreprise")
public class EntrepriseController {

	private EntrepriseService eService;

	public EntrepriseController(EntrepriseService eService) {
		super();
		this.eService = eService;
	}

	@GetMapping("{id}")
	public ResponseEntity<?> getEntrepriseFromId(@PathVariable int id) {

		Optional<Entreprise> optionalEntreprise = eService.recupererEntreprise(id);

		if (optionalEntreprise.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).header("message", "Entreprisée trouvée")
					.body(optionalEntreprise.get());

		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("L’ID fourni ne correspond pas à un ID de client en base de données !");
		}
	}

	@GetMapping("all")
	public ResponseEntity<?> getAllEntreprises() {

		List<Entreprise> listeE = eService.listerEntreprise();

		if (!listeE.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).header("message", "Entreprisée trouvée").body(listeE);

		} else { // listeE.isEmpty = true
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("Aucune entreprise enregistré en BDD ");
		}
	}

}
