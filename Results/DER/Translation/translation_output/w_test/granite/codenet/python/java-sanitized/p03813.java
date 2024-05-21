import java.util.Scanner;

public class p03813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String result = a < 1200? "ABC" : "ARC";
        System.out.println(result);
    }
}