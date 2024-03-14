import java.util.Scanner;

public class p03109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("/");
        String A = input[0];
        String B = input[1];
        String C = input[2];
        int year = Integer.parseInt(A);
        int month = Integer.parseInt(B);
        int day = Integer.parseInt(C);

        if (year <= 2018) {
            System.out.println("Heisei");
        } else if (year == 2019 && month <= 4 && day <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}