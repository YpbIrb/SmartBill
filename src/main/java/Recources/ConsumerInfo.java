package Recources;

public class ConsumerInfo {

	private String name;

	private float donation;

	public String GetName() {
		return name;
	}

	public void SetName(String name) {
		this.name = name;
	}

	public float GetDonation() {
		return donation;
	}

	public void SetDonation(float donat) {
		this.donation = donat;
	}

	public ConsumerInfo(String name, float donation) {
		this.name = name;
		this.donation = donation;
	}



}
