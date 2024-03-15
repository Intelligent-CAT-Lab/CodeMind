Solution


import java.util.Scanner;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        int x = a;
        int h = 0;
        int s = 0;
        while (x > 0) {
            x -= 1;
            h += 1;
            s += 1;
        }
        while (s / b != 0) {
            h += 1;
            s = s - b + 1;
        }
        System.out.println(h);
    }
}