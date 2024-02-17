import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
        System.out.println(a + " ▁ " + b + " ▁ " + c);
    }
}