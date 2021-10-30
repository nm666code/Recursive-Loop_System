import java.util.Scanner;

public class Command {
	/*deal with command*/
	public void getCommand(Scanner sc) {
		while (sc.hasNext()) {
			String input = sc.next();
			
			if(input.equalsIgnoreCase("!help"))
				help();
			else if(input.equalsIgnoreCase("Rpali"))
				Rpali(sc);
			else if(input.equalsIgnoreCase("Lpali"))
				Lpali(sc);
			else if(input.equalsIgnoreCase("RGCD1"))
				RGCD1(sc);
			else if(input.equalsIgnoreCase("RGCD2"))
				RGCD2(sc);
			else if(input.equalsIgnoreCase("RGCD3"))
				RGCD3(sc);
			else if(input.equalsIgnoreCase("LGCD1"))
				LGCD1(sc);
			else if(input.equalsIgnoreCase("LGCD2"))
				LGCD2(sc);
			else if(input.equalsIgnoreCase("LGCD3"))
				LGCD3(sc);
			else if(input.equalsIgnoreCase("Rfactor"))
				Rfactor(sc);
			else if(input.equalsIgnoreCase("Lfactor"))
				Lfactor(sc);
			else if(input.equalsIgnoreCase("input"))
				input(sc);
			else if(input.equalsIgnoreCase("ms-a"))
				ms_a(sc);
			else if(input.equalsIgnoreCase("ms-d"))
				ms_d(sc);
			else if(input.equalsIgnoreCase("Rstar"))
				Rstar(sc);
			else if(input.equalsIgnoreCase("Lstar"))
				Lstar(sc);
			else if(input.equalsIgnoreCase("Rdiam"))
				Rdiam(sc);
			else if(input.equalsIgnoreCase("Ldiam"))
				Ldiam(sc);
			else if(input.equalsIgnoreCase("Quit")) 
				quit(sc);
			else
				System.out.println("Error: not legal command");
			System.out.println();
			System.out.println("Please input next command");
			getCommand(sc);
		}
	}
	
	private void help() {
		System.out.println("Rpali   to check the string is palindrome or not by recursive");
		System.out.println("Lpali   to check the string is palindrome or not by loop");
		System.out.println("RGCD1   to calculate the GCD of two numbers by Euclidean algorithm modular steps recursive version");
		System.out.println("RGCD2   to calculate the GCD of two numbers by Euclidean algorithm subtraction steps recursive version");
		System.out.println("RGCD3   to calculate the GCD of two numbers by Brute Force recursive version");
		System.out.println("LGCD1   to calculate the GCD of two numbers by Euclidean algorithm modular steps loop version");
		System.out.println("LGCD2   to calculate the GCD of two numbers by Euclidean algorithm subtraction steps loop version");
		System.out.println("LGCD3   to calculate the GCD of two numbers by Brute Force loop version");
		System.out.println("Rfactor to factorized number by recursive");
		System.out.println("Lfactor to factorized number by loop");
		System.out.println("input   to input numbers for merge sort");
		System.out.println("ms-a    to merge sort by ascending order");
		System.out.println("ms-d    to merge sort by descending order");
		System.out.println("Rstar   to print the triangle with n layers constitute of the charater by recursive");
		System.out.println("Lstar   to print the triangle with n layers constitute of the charater by loop");
		System.out.println("Rdiam   to print the diamond with n layers constitute of the charater by recursive");
		System.out.println("Ldiam   to print the diamond with n layers constitute of the charater by loop");
	
	}
	
	private void Rpali(Scanner sc) {
		System.out.println("Please input the String to check the palindrome");
		Palindrome.isPaliR(sc.next());
	}
	
	private void Lpali(Scanner sc) {
		System.out.println("Please input the String to check the palindrome");
		Palindrome.isPaliL(sc.next());
	}
	
	private void RGCD1(Scanner sc) {
		System.out.println("Please input two numbers to check the GCD");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(GCD.RGCD1(n, m));
	}
	
	private void RGCD2(Scanner sc) {
		System.out.println("Please input two numbers to check the GCD");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(GCD.RGCD2(n, m));
	}
	
	private void RGCD3(Scanner sc) {
		System.out.println("Please input two numbers to check the GCD");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(GCD.RGCD3(n, m));
	}
	
	private void LGCD1(Scanner sc) {
		System.out.println("Please input two numbers to check the GCD");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(GCD.LGCD1(n, m));
	}
	
	private void LGCD2(Scanner sc) {
		System.out.println("Please input two numbers to check the GCD");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(GCD.LGCD2(n, m));
	}
	
	private void LGCD3(Scanner sc) {
		System.out.println("Please input two numbers to check the GCD");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(GCD.LGCD3(n, m));
	}
	
	private void Rfactor(Scanner sc) {
		System.out.println("Please input the number to factorize");
		int n = sc.nextInt();
		System.out.println(Factorization.Rfactor(n));
	}
	
	private void Lfactor(Scanner sc) {
		System.out.println("Please input the number to factorize");
		int n = sc.nextInt();
		System.out.println(Factorization.Lfactor(n));
	}
	
	private void input(Scanner sc) {
		System.out.println("Please input numbers to sort");
		String dataLine = sc.nextLine();
		
		if(dataLine.isEmpty())
			dataLine = sc.nextLine();
		
		String[] datastrs = dataLine.split("\\s+");
		int[] data = new int[datastrs.length];
		int i = 0;
		
		for(String s: datastrs) {
			data[i] = Integer.parseInt(s);
			i++;
		}
		
		MergeSort.setData(data);
		System.out.println("Finished loading");
	}
	
	private void ms_a(Scanner sc) {
		int[] result = MergeSort.ms_a(MergeSort.getData());
		System.out.println("After merge sort");
		for(int i: result)
			System.out.print(i + " ");
		System.out.println();
	}
	
	private void ms_d(Scanner sc) {
		int[] result = MergeSort.ms_d(MergeSort.getData());
		System.out.println("After merge sort");
		for(int i: result)
			System.out.print(i + " ");
		System.out.println();
	}
	
	private void Rstar(Scanner sc) {
		System.out.println("Please input the number of layers and the constitute charater");
		int layer = sc.nextInt();
		char c = sc.next().charAt(0);
		PrintPattern.Rstar(layer, c);
	}
	
	private void Lstar(Scanner sc) {
		System.out.println("Please input the number of layers and the constitute charater");
		int layer = sc.nextInt();
		char c = sc.next().charAt(0);
		PrintPattern.Lstar(layer, c);
	}
	
	private void Rdiam(Scanner sc) {
		System.out.println("Please input the number of layers and the constitute charater");
		int layer = sc.nextInt();
		char c = sc.next().charAt(0);
		PrintPattern.Rdiam(layer, c);
	}
	
	private void Ldiam(Scanner sc) {
		System.out.println("Please input the number of layers and the constitute charater");
		int layer = sc.nextInt();
		char c = sc.next().charAt(0);
		PrintPattern.Ldiam(layer, c);
	}
	
	private void quit(Scanner sc) {
		sc.close();
		System.out.println("Bye Bye");
		System.exit(0);
	}
	
}
