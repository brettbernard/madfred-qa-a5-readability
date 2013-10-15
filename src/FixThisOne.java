import java.util.Scanner;

public class FixThisOne {

	public static void main(String[] args) 
	{
		//This program checks your price of eggs
		//This is a bunch of code don't know what it does
		final float PRICE_PER_DOZEN = 3.25f;
		final float PRICE_PER_SINGLE = 0.45f;
		int eggs, dozens, singles;
		float dozens_cost, singles_cost, tc;
		
		Scanner kbrd = new Scanner(System.in);
		System.out.print("How many eggs do you want? >> ");
		eggs = kbrd.nextInt();
		dozens = eggs / 12;
		singles = eggs % 12;
		
		dozens_cost = dozens * PRICE_PER_DOZEN;
		singles_cost = singles * PRICE_PER_SINGLE;
		tc = dozens_cost + singles_cost;
		
		/*This program checks your price of eggs 
		 * This is a block comment
		 * Coding is fun!
		 */
		System.out.println("You ordered " + eggs + " eggs in total.");
		System.out.println("That's " + dozens + " dozen at $3.25, or $" + dozens_cost);
		System.out.println("That's " + singles + " singles at 45c, or $" + singles_cost);
		System.out.println("Your total cost is $" + tc);
		
	
	}

}
