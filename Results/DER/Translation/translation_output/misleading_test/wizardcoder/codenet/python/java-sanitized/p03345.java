public class p03345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        if (K % 2 == 0) { // å¶æ°
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}