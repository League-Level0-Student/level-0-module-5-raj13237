package extra;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	static boolean number =true;
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Type in a number greater than 1");
		int response = Integer.parseInt(answer);
		for(int i=2;i<response;i++) {
			if(response%i==0) {
			JOptionPane.showMessageDialog(null, "Composite number");
			number = false;
			break;
		}
			
			
			
		
	}
		if(number ==true) {
			JOptionPane.showMessageDialog(null, "Prime number");
		}
		
}
}