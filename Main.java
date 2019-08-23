
import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		boolean active = true;
		boolean alright = true;
		
		while(active) {
			if(alright) {
				new Process();
			}
			System.out.println("do you wish to continue? (y/n)");
			String response = input.nextLine();
			if(response.equals("n")){
				active = false;
			} else if (!(response.equals("y"))) {
				System.out.println("please enter either 'y' or 'n' when prompted '(y/n)'");
				alright = false;
			} else {
				alright = true;
			}
		}

	}
}
