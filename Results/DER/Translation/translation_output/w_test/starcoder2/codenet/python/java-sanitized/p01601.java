public class p01601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 100000; i++) {
            if (n >= i && palind(n - i)) {
                System.out.println(n - i);
                break;
            }
            if (palind(n + i)) {
                System.out.println(n + i);
                break;
            }
        }
    }

    public static boolean palind(int n) {
        String s = String.valueOf(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}