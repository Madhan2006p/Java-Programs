public class Welcome {

    public void put(String Name) { 
        System.out.println("Hi " + Name + " " + ", welcome to the inauguration ceremony");
    }
    public static void main ( String [] args) {
        Welcome obj = new Welcome();
        obj.put(args[0]);
    }
}
