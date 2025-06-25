class testCalculation {
		
		public static int Fact (int n) {
			int f = 1;
			for(int var = 1 ; var <= n ;  var += 1)
					f = f * var;
			return f;
		}
		public static void main (String[] args) { 
			int n = Integer.parseInt(args[0]);
			double sum = 0.0d;
			for(int var = 1 ; var <= n ; var += 1) 
				sum = sum + (double) ((double)var / (double) Fact(var)) ;
			
			System.out.println(sum);
		}
	
	
	
	
	
	
}