package hero.manager.services;

import com.google.gson.JsonArray;

class AmigosRestService extends RestService {

	public JsonArray getAmistades() {
		return get("https://hero-manager-api.herokuapp.com/amistades");
	}
}
