public class p03543 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int a = N % 10;
        int b = N / 10 % 10;
        int c = N / 100 % 10;
        int d = N / 1000 % 10;
        if (a == b || b == c || c == d || b == c || d == a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}