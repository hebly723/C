package cn.com.dick.threepointthirteen.Invoice;
import javax.swing.JOptionPane;
/**
 * @author ���Ƚ�
 * 
 * 2016��1��24������5:21:25
 */
public class InvoiceTest {
//main method begins execution of Java application
	public static void main(String[] args) {
		
		String identifier;//product's identifier input by user
		int	number;//product's amounts input by user
		double	price;//product's price input by user
		String	introduction;//production's introduction input by user
		
		//prompt user to enter
		identifier = 
			JOptionPane.
			showInputDialog("�����Ʒ�ı�ţ�");//prompt for identifier
		number =
			Integer.
			parseInt(JOptionPane.
					showInputDialog("�����Ʒ������"));//prompt for number
		price = 
			Double.
			parseDouble(JOptionPane.
					showInputDialog("�����Ʒ�۸�"));//prompt for price
		introduction =
				JOptionPane.
				showInputDialog("�����Ʒ˵����");//prompt for introduction
		
		//create an Invoice object
		Invoice myInvoice = new Invoice(identifier, introduction, number, price);
		
		//create message
		String message = String.
				format(
						"���%s����Ʒ(%s)��Ʊ�ܼ�����Ϊ%.2f", 
						myInvoice.getIdentifier(), myInvoice.getIntroduction(),
						myInvoice.getInvoiceAmount());
		
		JOptionPane.showMessageDialog(null, message);

	}//end method main

}//end class InvoiceTest
