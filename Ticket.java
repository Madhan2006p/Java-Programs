class Ticket {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int Child = (y - 5 * x) / 13;
        int Adult = x + Child;
        int Senior = Child * 2;
        System.out.println(Child);
        System.out.println(Adult);
        System.out.println(Senior); 
    }
}
