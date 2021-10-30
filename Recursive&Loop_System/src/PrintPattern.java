
public class PrintPattern {
	public static void Rstar(int layer, char c) {
		recursiveTriangle(1, layer, c);
	}
	
	private static void recursiveTriangle(int currentLayer, int totalLayer, char c) {
		if(currentLayer <= totalLayer) {
			for(int i = 0; i < totalLayer - currentLayer; i++)
				System.out.print(" ");
			for(int i = 0; i < currentLayer * 2 - 1; i++)
				System.out.print(c);
			System.out.println();
			recursiveTriangle(++currentLayer, totalLayer, c);
		}
	}
	
	public static void Lstar(int layer, char c) {
		for(int i = 1; i <= layer; i++) {
			for(int j = 0; j < layer - i; j++) 
				System.out.print(" ");
			for(int j = 0; j < i * 2 - 1; j++) 
				System.out.print(c);
			System.out.println();
		}
	}
	
	public static void Rdiam(int layer, char c) {
		recursiveDiam(1, layer, c);
	}
	
	private static void recursiveDiam(int currentLayer, int totalLayer, char c) {
		if(currentLayer <= totalLayer) {
			if(currentLayer <= (totalLayer + 1) / 2) {
				for(int i = 0; i < (totalLayer + 1) / 2 - currentLayer; i++)
					System.out.print(" ");
				for(int i = 0; i < currentLayer * 2 - 1; i++)
					System.out.print(c);
				System.out.println();
			}
			else {
				for(int i = 0; i < currentLayer - (totalLayer / 2 + 1); i++)
					System.out.print(" ");
				for(int i = 0; i < (totalLayer - currentLayer) * 2 + 1; i++)
					System.out.print(c);
				System.out.println();
			}
			recursiveDiam(++currentLayer, totalLayer, c);
		}
	}
	
	public static void Ldiam(int layer, char c) {
		for(int i = 1; i <= (layer + 1) / 2; i++) {
			for(int j = 0; j < (layer + 1) / 2 - i; j++) 
				System.out.print(" ");
			for(int j = 0; j < i * 2 - 1; j++) 
				System.out.print(c);
			System.out.println();
		}
		
		for(int i = (layer + 3) / 2; i <= layer; i++) {
			for(int j = 0; j < i - (layer / 2 + 1); j++) 
				System.out.print(" ");
			for(int j = 0; j < (layer - i) * 2 + 1; j++) 
				System.out.print(c);
			System.out.println();
		}
	}
}
