import java.util.Scanner;

public class p03737 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next().toUpperCase();
        String s2 = scanner.next().toUpperCase();
        String s3 = scanner.next().toUpperCase();
        System.out.println(s1.charAt(0) + "" + s2.charAt(0) + "" + s3.charAt(0));
    }
}