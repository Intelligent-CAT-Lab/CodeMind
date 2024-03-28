import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int b1 = Integer.parseInt(new StringBuilder(b).reverse().toString());
        System.out.println(Integer.parseInt(a) + b1);
    }
}