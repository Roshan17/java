/* This is to demonstrate java if statement */

class IfSample{
	public static void main( String args [] ){
		int x,y;
		
		x = 10;
		y = 20;

		if(x<y) System.out.println("x is lesser than y");

		x = x * 2;
		if(x == y) System.out.println("x is now equals to y");
		
		
		x = x * 2;
		if(x > y) System.out.println("x is now greter than y");

		// This will not display anything
		if(x == y) System.out.println("You won't see this");

	}
	

}
