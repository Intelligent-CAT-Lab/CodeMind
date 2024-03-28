import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        int b_reverse = Integer.parseInt(new StringBuilder(b).reverse().toString());
        System.out.println(Integer.parseInt(a) + b_reverse);
    }
}