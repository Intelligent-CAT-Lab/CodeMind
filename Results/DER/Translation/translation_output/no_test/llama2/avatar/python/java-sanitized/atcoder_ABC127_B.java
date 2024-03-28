Solution


import java.util.Scanner;

public class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, D, x;
        r = Integer.parseInt(sc.nextLine());
        D = Integer.parseInt(sc.nextLine());
        x = r * x - D;
        for (int i = 1; i <= 10; i++) {
            System.out.println(x);
        }
    }
}