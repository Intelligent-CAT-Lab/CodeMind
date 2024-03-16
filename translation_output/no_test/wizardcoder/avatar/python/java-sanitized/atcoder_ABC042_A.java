import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = sc.nextInt();
        }
        if (ABC[0] == 5 && ABC[1] == 5) {
            System.out.println("YES");
        } else if (ABC[0] + ABC[1] == 10 && ABC[2] == 5) {
            System.out.println("YES");
        } else if (ABC[0] + ABC[1] + ABC[2] == 15) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}