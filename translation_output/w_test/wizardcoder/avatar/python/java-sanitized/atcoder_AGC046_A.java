import java.util.Scanner;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int i = 1;
        int a = 0;
        while (true) {
            a = a + X;
            if (a % 360 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}