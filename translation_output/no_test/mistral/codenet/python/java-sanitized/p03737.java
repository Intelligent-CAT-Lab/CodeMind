import java.util.Scanner;

public class p03737 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toUpperCase().split("");
        String s2 = s1[0];
        String s3 = s1[1];
        System.out.println(s2 + s2 + s3);
    }
}