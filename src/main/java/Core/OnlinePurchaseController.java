package Core;

import Recources.ServerInfo;
import Recources.ConsumerInfo;
import Recources.ProductInfo;
import Recources.CommitInfo;

import java.util.Map;

public class OnlinePurchaseController implements IPurchaseController {

	private ServerInfo server;

	public void ModifyConsumer(String consumer_name, ConsumerInfo new_cons_info) {

	}

	public void ModifyProduct(String productName, ProductInfo new_product_info) {

	}

	public void SavePurchaseInfo() {

	}

	public void VerificateData() {

	}

	public void AddProductToCommit(ProductInfo product) {

	}

	public void GetResult() {

	}

	public void AddConsumerToCommit(ConsumerInfo consumer) {

	}

	public CommitInfo CreateNewCommit() {
		return null;
	}

	public void PushCommit(CommitInfo commit) {

	}

	public void RemoveProductFromCommit() {

	}

	public void RemoveConsumerFromCommit() {

	}


	public void SetConsumersOnProduct(String productName, Map<ConsumerInfo, Integer> consumers) {

	}

	public void SetConsumersOnProductInCommit(String productName, Map<String,Integer> consumers, CommitInfo commit) {

	}



}
