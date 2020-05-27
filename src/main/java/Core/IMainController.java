package Core;

public interface IMainController {

	public abstract OfflinePurchaseController CreateNewOfflinePurchase();

	public abstract OnlinePurchaseController CreateNewOnlinePurchase();

}
