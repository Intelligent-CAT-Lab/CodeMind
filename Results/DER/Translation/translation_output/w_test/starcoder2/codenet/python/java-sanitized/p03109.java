import java.util.Scanner;

public class p03109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("/");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        if (A <= 2018) {
            System.out.println("Heisei");
        } else if (A == 2019 && B <= 4 && C <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}