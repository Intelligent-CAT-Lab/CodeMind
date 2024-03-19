public class p03327 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 1000) {
            System.out.println("ABC");
        } else {
            System.out.println("ABD");
        }
    }
}



$ java Main 999
ABC