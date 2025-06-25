class MonthClassifier {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n < 1 || n > 12) {
            System.out.println("Invalid month");
            return;
        }

        if (n == 2) {
            System.out.println("28 or 29 days");
        } else if (n == 4 || n == 6 || n == 9 || n == 11) {
            System.out.println("30 days");
        } else {
            System.out.println("31 days");
        }
    }
}
