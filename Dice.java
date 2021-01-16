import javax.swing.JOptionPane;
import java.util.Random;

public class Dice {
	
	public static void main(String[] args) {
		
		
		Random random = new Random();
	
		int dice = 0;
		dice= random.nextInt(6)+1;
		
		switch (dice) {
		case 1: System.out.println("You rolled 1 ");
		break;
		case 2: System.out.println("You rolled 2 ");
		break;
		case 3: System.out.println("You rolled 3 ");
		break;
		case 4: System.out.println("You rolled 4 ");
		break;
		case 5: System.out.println("You rolled 5 ");
		break;
		case 6: System.out.println("You rolled 6");
		break;
		}
		
		JOptionPane.showMessageDialog(null, "You rolled a " + dice);


		if (dice ==6) {
			System.out.println("You have to do a push-up!");
		}
	}
}
