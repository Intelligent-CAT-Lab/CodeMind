public class p03863 {
    public static void main(String[] args) {
        String s = "aba";
        if ((s.charAt(0) == s.charAt(s.length() - 1) && s.length() % 2 == 0) || (s.charAt(0) != s.charAt(s.length() - 1) && s.length() % 2 == 1)) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}