import java.util.Scanner;

public class p03813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        
        if (a < 1200) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}