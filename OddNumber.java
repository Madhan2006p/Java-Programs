class OddNumber {
	
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		
		for(int var = 1 ; var <= n ; var += 2) {
			System.out.print(var + " ");
		}
	}
}