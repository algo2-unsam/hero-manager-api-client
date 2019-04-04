package hero.manager.services;

import com.google.gson.JsonArray;

public class ItemsRestService extends RestService {
	
	public JsonArray getItems() {
		return get("https://hero-manager-api.herokuapp.com/items");
	}

}
