/**
 * 
 */
package cn.com.dick.seven.twentytwo;
import javax.swing.JFrame;
/**
 * @author ���Ƚ�
 * 
 * 2016��2��9������8:10:28
 */
public class DrawRainbowTest {

	public static void main(String[] args) {
		DrawRainbow panel = new DrawRainbow();
		JFrame application  = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400,250);
		application.setVisible(true);

	}//end main

}//end class DrawRainbowTest
