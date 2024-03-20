import java.util.Scanner;

public class p02124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "ai1333";
        int k = n / 100;
        for (int i = 0; i < k; i++) {
            s += "3";
        }
        System.out.println(s);
    }
}