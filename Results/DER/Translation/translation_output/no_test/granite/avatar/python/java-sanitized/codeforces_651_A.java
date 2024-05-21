import java.util.*;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a1 = Integer.parseInt(input[0]);
        int a2 = Integer.parseInt(input[1]);
        int t = 0;
        if (a1 == 1 && a2 == 1) {
            System.out.println(0);
        } else {
            while (a1 > 0 && a2 > 0) {
                if (a1 > a2) {
                    a2 += 1;
                    a1 -= 2;
                } else {
                    a2 -= 2;
                    a1 += 1;
                }
                t += 1;
            }
            System.out.println(t);
        }
    }
}