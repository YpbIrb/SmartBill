package Core;

import Recources.ConsumerInfo;
import Recources.ProductInfo;
import Recources.CommitInfo;

import java.util.Map;

public interface IPurchaseController {

	public abstract void ModifyConsumer(String consumer_name, ConsumerInfo new_cons_info);

	public abstract void ModifyProduct(String productName, ProductInfo new_product_info);

	public abstract void SavePurchaseInfo();

	public abstract void VerificateData();

	public abstract void AddProductToCommit(ProductInfo product );

	public abstract void GetResult();

	public abstract void AddConsumerToCommit(ConsumerInfo consumer);

	public abstract CommitInfo CreateNewCommit();

	public abstract void PushCommit(CommitInfo commit);

	public abstract void RemoveProductFromCommit();

	public abstract void RemoveConsumerFromCommit();

	public abstract void SetConsumersOnProduct(String productName, Map<ConsumerInfo, Integer> consumers);

}
