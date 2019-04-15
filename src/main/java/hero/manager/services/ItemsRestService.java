package hero.manager.services;

public class ItemsRestService extends RestService {
	
	public String getItems() {
		return get("https://hero-manager-api.herokuapp.com/items");
	}

}
