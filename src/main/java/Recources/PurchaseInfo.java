package Recources;

import java.util.List;
import java.util.Map;

public class PurchaseInfo {

	private String name;

	private List<ConsumerInfo> consumers;

	private List<ProductInfo> products;

	public void SetName(String name) {
		this.name = name;
	}

	public List<ConsumerInfo> GetConsumers() {
		return consumers;
	}

	public List<ProductInfo> GetProducts() {
		return products;
	}

	public String GetName() {
		return name;
	}

	public void AddConsumer(ConsumerInfo new_cons) {
		String old_cons_name = new_cons.GetName();
		String new_cons_name = new_cons.GetName();

		int repeats_counter = 0;
		for (int i = 0; i < consumers.size(); i++){
			if (consumers.get(i).GetName().equals(new_cons_name)){
				repeats_counter++;
				new_cons_name = old_cons_name + '(' + i + ')';
			}
		}
		if (repeats_counter > 0)
			new_cons.SetName(new_cons_name);
		consumers.add(new_cons);
	}

	public void AddProduct(ProductInfo new_prod) {
		String old_prod_name = new_prod.GetName();
		String new_prod_name = new_prod.GetName();

		int repeats_counter = 0;
		for (int i = 0; i < products.size(); i++){
			if (products.get(i).GetName().equals(new_prod_name)){
				repeats_counter++;
				new_prod_name = old_prod_name + '(' + i + ')';
			}
		}
		if (repeats_counter > 0)
			new_prod.SetName(new_prod_name);
		products.add(new_prod);
	}

	public void DeleteConsumer(String cons_name) {
		for (ConsumerInfo cons: consumers){
			if (cons.GetName().equals( cons_name)){
				consumers.remove(cons);
				break;
			}
		}

	}

	public void ChangeConsumer(String cons_name, ConsumerInfo new_cons_info) {
		for (ConsumerInfo cons: consumers){
			if (cons.GetName().equals( cons_name)){
				cons.SetName(new_cons_info.GetName());
				cons.SetDonation(new_cons_info.GetDonation());
				break;
			}
		}
	}

	public void DeleteProduct(String prod_name) {
		for (ProductInfo prod: products){
			if (prod.GetName().equals(prod_name)){
				products.remove(prod);
				break;
			}
		}
	}

	public void ChangeProduct(String prod_name, ProductInfo new_prod_info) {
		for (ProductInfo prod: products){
			if (prod.GetName().equals(prod_name)){
				prod.SetName(new_prod_info.GetName());
				prod.SetAmount(new_prod_info.GetAmount());
				prod.SetCost(new_prod_info.GetCost());
				prod.SetConsumers(new_prod_info.GetConsumers());
				break;
			}
		}
	}

	public void SetConsumersForProduct(Map<String,Integer> cons_with_coefs, String prod_name) {
		for (ProductInfo prod: products){
			if (prod.GetName().equals(prod_name)){
				prod.SetConsumers(cons_with_coefs);
				break;
			}
		}
	}

	public void PullCommit(CommitInfo commit){
		for (ConsumerInfo new_consumer : commit.GetConsumers()){
			AddConsumer(new_consumer);
		}
		for (ProductInfo new_product : commit.GetProducts()){
			AddProduct(new_product);
		}

	}

}
