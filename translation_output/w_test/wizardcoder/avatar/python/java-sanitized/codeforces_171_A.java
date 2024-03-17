import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(new StringBuilder(input[1]).reverse().toString());
        System.out.println(a + b);
    }
}