import java.util.Scanner;

public class p03219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        
        int fare = (int) (ab + bc / 2.0);
        
        System.out.println(fare);
    }
}