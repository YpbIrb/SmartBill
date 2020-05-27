package Recources;

import java.util.List;

public class CommitInfo {

	private List<ConsumerInfo> consumers;

	private List<ProductInfo> products;

	public void AddNewProduct(ProductInfo new_prod) {
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

	public void AddNewConsumer(ConsumerInfo new_cons) {
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

	public void RemoveProduct(String prod_name) {
		for (ProductInfo prod: products){
			if (prod.GetName().equals(prod_name)){
				products.remove(prod);
				break;
			}
		}
	}

	public void RemoveConsumer(String cons_name) {
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

	public void ChangeProduct(String prod_name, ProductInfo new_product_info) {
		for (ProductInfo prod: products){
			if (prod.GetName().equals(prod_name)){
				prod.SetName(new_product_info.GetName());
				prod.SetAmount(new_product_info.GetAmount());
				prod.SetCost(new_product_info.GetCost());
				prod.SetConsumers(new_product_info.GetConsumers());
				break;
			}
		}
	}

	public List<ConsumerInfo> GetConsumers(){
		return consumers;
	}

	public List<ProductInfo> GetProducts(){
		return products;
	}


}
