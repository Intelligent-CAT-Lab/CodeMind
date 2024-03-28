import java.util.Scanner;

public class p02594 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int X = input.nextInt();
        
        if (X >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}