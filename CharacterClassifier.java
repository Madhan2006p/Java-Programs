class CharacterClassifier {
    public static void main(String[] args) {
        char ch[] = args[0].toCharArray();
        if(ch[0] >= 'a' && ch[0] <= 'z' || ch[0] >= 'A' && ch[0] <= 'Z')
            System.out.println("Alphabet");
        else if(ch[0] >= '0' && ch[0] <= '9')
            System.out.println("Number");
        else
            System.out.println("Special symbol");
    }    
}
