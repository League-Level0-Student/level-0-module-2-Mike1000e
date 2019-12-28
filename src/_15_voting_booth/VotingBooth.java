package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
		public static void main(String[] args) {
			String age = JOptionPane.showInputDialog(null, "How old are you???");
			int num = Integer.parseInt(age);
			if(num >= 18) {
				JOptionPane.showMessageDialog(null, "Who should the next president be??");
				
				
				
			}else {
				
				
				JOptionPane.showMessageDialog(null, "No one cares what you think");
			}
			
			
	
	
	
	
	
	}
}
