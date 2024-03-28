public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int lcm = x * y / GCD(x, y);
        int result = (b - 1) / lcm;
        System.out.println(result);
    }

    public static int GCD(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}