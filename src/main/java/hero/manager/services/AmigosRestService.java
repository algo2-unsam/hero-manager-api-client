package hero.manager.services;

public class AmigosRestService extends RestService {

	public String getAmistades() {
		return get("https://hero-manager-api.herokuapp.com/amistades");
	}
}
