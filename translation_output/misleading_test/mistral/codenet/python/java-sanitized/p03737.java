import java.util.Scanner;

public class p03737 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toUpperCase().split("");
        String s2 = scanner.nextLine().toUpperCase().split("");
        String s3 = scanner.nextLine().toUpperCase().split("");
        System.out.println(s1[0] + s2[0] + s3[0]);
    }
}