import java.util.Scanner;

public class p00400 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        if ((n >= 65) && (n <= 90)) {
            System.out.println("1");
        } else if ((n >= 97) && (n <= 122)) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
        
        scanner.close();
    }
}