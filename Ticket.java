class Ticket {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int TotalAdults = (x * 5) - 700 / (x * 5);
        System.out.println(TotalAdults); 
    }
}
