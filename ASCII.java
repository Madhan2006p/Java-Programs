import java.util.*;

class ASCII {
    char userInput;
    public void get() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Value : ");
        userInput = scan.next().charAt(0);
    }

    public void put(int res) {
        System.out.println("User Input : " + " " + res);
    }
    public void cast() {
        int res = (int) userInput;
        put(res);
    }
    public static void main(String[] args) {
        ASCII obj = new ASCII();
        obj.get(); 
        obj.cast();
    }
}