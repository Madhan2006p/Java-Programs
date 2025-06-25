class Salary { 
	
	public static void main ( String [] args ) {
		
		int n = Integer.parseInt(args[0]);
		int sum = 10;
		int salary = 0;
		
		while( n != 0 ) {
			
			salary += sum;
			sum *= 2;
			n -= 1;
		}
		
		System.out.println(salary);
	}
}