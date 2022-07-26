package telCorpProject.entities;

import java.util.ArrayList;
import java.util.List;

public class Service {
	private int id;
	private String name;
	private final List<Subscription> subscriptions = new ArrayList<>();
	
	public Service(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}
	
}
