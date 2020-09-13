package dev.paie.web.bulletinSalaire;

import java.util.ArrayList;
import java.util.List;

import dev.paie.entite.BulletinSalaire;
import dev.paie.entite.Cotisation;
import dev.paie.service.CotisationService;
import dev.paie.web.cotisation.CotisationReponseDto;

public class BulletinSalairePrecisDto extends BulletinSalaireReponseDto {

	private CotisationService cService;
	private List<CotisationReponseDto> listeCotisationsBulletinDto = new ArrayList();
	private String dateDebutPeriodeBulletin;
	private String dateFinPeriodeBulletin;
	private String nomEntreprise;
	private String siretEntreprise;

	public BulletinSalairePrecisDto(BulletinSalaire bulletin) {
		super(bulletin);

		// Gestion infos Générales
		this.dateDebutPeriodeBulletin = bulletin.getPeriode().getDateDebut().toString();
		this.dateFinPeriodeBulletin = bulletin.getPeriode().getDateFin().toString();
		this.nomEntreprise = bulletin.getRemunerationEmploye().getEntreprise().getDenomination();
		this.siretEntreprise = bulletin.getRemunerationEmploye().getEntreprise().getSiret();

		// Gestion Cotisations
		List<Cotisation> listeCotisationsBulletin = bulletin.getRemunerationEmploye().getProfilRemuneration()
				.getCotisations();
		for (Cotisation cotisationObj : listeCotisationsBulletin) {
			this.listeCotisationsBulletinDto.add(new CotisationReponseDto(cotisationObj));
		}

	}

	public CotisationService getcService() {
		return cService;
	}

	public void setcService(CotisationService cService) {
		this.cService = cService;
	}

	public List<CotisationReponseDto> getListeCotisationsBulletinDto() {
		return listeCotisationsBulletinDto;
	}

	public void setListeCotisationsBulletinDto(List<CotisationReponseDto> listeCotisationsBulletinDto) {
		this.listeCotisationsBulletinDto = listeCotisationsBulletinDto;
	}

	public String getDateDebutPeriodeBulletin() {
		return dateDebutPeriodeBulletin;
	}

	public void setDateDebutPeriodeBulletin(String dateDebutPeriodeBulletin) {
		this.dateDebutPeriodeBulletin = dateDebutPeriodeBulletin;
	}

	public String getDateFinPeriodeBulletin() {
		return dateFinPeriodeBulletin;
	}

	public void setDateFinPeriodeBulletin(String dateFinPeriodeBulletin) {
		this.dateFinPeriodeBulletin = dateFinPeriodeBulletin;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getSiretEntreprise() {
		return siretEntreprise;
	}

	public void setSiretEntreprise(String siretEntreprise) {
		this.siretEntreprise = siretEntreprise;
	}

}
