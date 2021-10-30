import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Recursive&Loop System");
		System.out.println("If you need help. Please input !help");
		System.out.println("I will show you all the commands");
		System.out.println();
		System.out.println("Please input some command");
		
		Scanner sc = new Scanner(System.in);
		Command cmd = new Command();
		cmd.getCommand(sc);
	}
}
