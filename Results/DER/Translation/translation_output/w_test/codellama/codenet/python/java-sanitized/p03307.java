public class p03307 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(2 * n);
        }
    }
}



$ java Main 3
6