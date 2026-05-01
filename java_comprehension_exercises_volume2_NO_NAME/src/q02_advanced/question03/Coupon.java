package q02_advanced.question03;

public class Coupon {
	private int id;
	private double discountRate;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getDescriptionString() {
		return description;
	}

	public void setDescriptionString(String descriptionString) {
		this.description = descriptionString;
	}

	public Coupon() {

	}

	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;

	}

	@Override
	public String toString() {
		return "Coupon [id=" + id
				+ ", discountRate=" + discountRate
				+ ", description=" + description + "]";
	}

	public static Coupon getInstance(int id, double discountRate, String description) {
		Coupon coupon = new Coupon(id, discountRate, description);
		return coupon;
	}
}
