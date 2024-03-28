import java.util.Scanner;

public class p02663 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int h1 = Integer.parseInt(input[0]);
        int m1 = Integer.parseInt(input[1]);
        int h2 = Integer.parseInt(input[2]);
        int m2 = Integer.parseInt(input[3]);
        int k = Integer.parseInt(input[4]);

        int t1 = 60 * h1 + m1;
        int t2 = 60 * h2 + m2;

        System.out.println(t2 - t1 - k);
    }
}