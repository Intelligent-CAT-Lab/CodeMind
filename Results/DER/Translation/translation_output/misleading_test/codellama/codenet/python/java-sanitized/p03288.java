public class p03288 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 1200) {
            System.out.println("ABC");
        } else if (n < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}