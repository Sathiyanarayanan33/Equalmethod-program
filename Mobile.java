package collection;

public class Mobile {

	private String mobilename;
	private int mobilemodel;
	private int price;
	private String specification;
	
	
	public Mobile(String mobilename, int mobilemodel, int price, String specification)
	{
		this.mobilename=mobilename;
		this.mobilemodel=mobilemodel;
		this.price=price;
		this.specification=specification;	
		
	}
	
	public String getMobilename() {
		return mobilename;
	}

	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}

	public int getMobilemodel() {
		return mobilemodel;
	}

	public void setMobilemodel(int mobilemodel) {
		this.mobilemodel = mobilemodel;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public static void main(String[] args) {

	}

	@Override
	public String toString() {
		return "Mobile [mobilename=" + mobilename + ", mobilemodel=" + mobilemodel + ", price=" + price
				+ ", specification=" + specification + "]";
	}

}
