package _06_lottery_numbers;
import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int num = ran.nextInt((9-0)+1);
		int num1 = ran.nextInt((9-0)+1);
		
		int num2 = ran.nextInt((9-0)+1);
		
		int num3 = ran.nextInt((9-0)+1);
		
		int num4 = ran.nextInt((9-0)+1);
		JOptionPane.showMessageDialog(null, "This is your lottery number -- " + num +  num1 + num2 + num3 + num4 );
	}
}
