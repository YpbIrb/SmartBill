package Recources;

import java.util.Map;

public class ProductInfo {

	private String name;

	private int cost;

	private int amount;

	private Map<String,Integer> consumers;

	public void SetName(String _name) {
		this.name = _name;
	}

	public void SetCost(int _cost) {
		this.cost = _cost;
	}

	public void SetAmount(int _amount) {
		this.amount = _amount;
	}

	public String GetName() {
		return name;
	}

	public int GetCost() {
		return cost;
	}

	public int GetAmount() {
		return amount;
	}

	public ProductInfo(String _name, int _cost,  int _amount) {
		this.name = _name;
		this.cost = _cost;
		this.amount = _amount;
	}

	public void SetConsumers(Map<String,Integer> new_consumers) {
		consumers = new_consumers;
	}

	public int GetCostForPart() {
		return 0;
	}

	public Map<String,Integer> GetConsumers() { return consumers; }

}
