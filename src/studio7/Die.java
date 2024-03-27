package studio7;
import edu.princeton.cs.introcs.StdDraw;

public class Die {

	private int n;
	
	public Die(int numberOfSides) {
		n = numberOfSides;
	}
	
	public static void main(String[] args) {
		
		Die D = new Die(6);
		System.out.println(D.rollDie());

	}
	
	public int rollDie() {
		
		int numberRolled = (int) (Math.random() * n) + 1;
		return numberRolled;
	}

}
