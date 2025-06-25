import java.util.Scanner;

class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("Enter the cost price : ");
		int cp = scan.nextInt();
		System.out.print("Enter the sell price : ");
		int sp = scan.nextInt();
		if (cp > sp)
				System.out.println("Loss : " + (cp - sp));
		if (cp < sp)
				System.out.println("Profit : " + (sp - cp));
		if ((cp - sp) == 0)
				System.out.println("No Profit / Loss ");
    }
}