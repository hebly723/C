//Exam 3.13
//stand for a invoice in a store
package cn.com.dick.threepointthirteen.Invoice;

/**
 * @author 张钊晋
 * 
 * 2016年1月24日下午5:20:54
 */
public class Invoice {
	private String identifier;//Identifier of  the product
	private String introduction;//introduction of the product
	private int number;//number of the product
	private double price;//price of the product
	
	public Invoice(String identifier, String introduction,
			int number, double price)
	{
		this.identifier = identifier;
		this.introduction = introduction;
		this.number = number;
		this.price = price;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getInvoiceAmount()
	{
		//judge
		if(price<0)
			price = 0.0;
		if(number<0)
			number = 0;
		
//		calculate the invoiceAmount
		double invoiceAmount = price * number;
		
		return invoiceAmount;
		
	}

}
