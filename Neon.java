class Neon {
	
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		
		int power = n * n;
		
		int Sum = 0 ;
		int rem = 0;
		while( power != 0 ) {
			rem = power % 10;
			Sum += rem;
			power = power / 10;
		}
		
		if ( Sum == n )
			System.out.println("Neon Number");
		else
			System.out.println("Not a Neon Number");
	}
	
}