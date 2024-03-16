import java.util.Scanner;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, x, h, s;
        a = sc.nextInt();
        b = sc.nextInt();
        x = a;
        h = 0;
        s = 0;
        while (x > 0) {
            x--;
            h++;
            s++;
        }
        while (s / b!= 0) {
            h++;
            s = s - b + 1;
        }
        System.out.println(h);
    }
}