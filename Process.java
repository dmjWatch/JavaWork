import java.util.Scanner;


public class Process {

	Scanner input = new Scanner(System.in);
	
	public Process() {
		startProcess();
	}
	
	public void startProcess() {
		boolean proceed = true;
		do {
			switch (promptUser()){
			case "help":
				System.out.println("Available options: 'snarky' and 'monster'");
				break;
			case "snarky":
				launchSnarky();
				proceed=false;
				break;
			case "monster":
				System.out.println("function not yet ready");
			} 
		}while(proceed);
		
	}
	
	
	
	public String promptUser() {
		System.out.println("what would you like to do('help' for list of commands)");
		String a = input.nextLine();
		return a;
	}
	
	private void launchSnarky() {
		System.out.println("dumbass");
		String insaneComeback = input.nextLine();
		if(insaneComeback.equals("no u")) {
			System.out.println("ouch, u got me.");
		} else {System.out.println("hah. weak.");
		}
	}
	
}
