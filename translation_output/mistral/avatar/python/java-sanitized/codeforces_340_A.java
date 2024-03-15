public class codeforces_340_A {
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
    public static void main(String[] args) {
        String input = System.console().readLine();
        String[] l = input.split(" ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);
        int lcm = LCM(x, y);
        System.out.println((b - 1) / lcm - a / lcm);
    }
}