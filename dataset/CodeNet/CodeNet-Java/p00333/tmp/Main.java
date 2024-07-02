
import java.util.Scanner;

class Main {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
System.out.println("[INST]15;W;sc.nextInt();"+W);
        int H = sc.nextInt();
System.out.println("[INST]16;H;sc.nextInt();"+H);
        int WH = gcd(W, H);
        int C = sc.nextInt();
System.out.println("[INST]18;C;sc.nextInt();"+C);

        
        int a = (W/WH)*(H/WH);
        
        System.out.println(a*C);
    }
}
