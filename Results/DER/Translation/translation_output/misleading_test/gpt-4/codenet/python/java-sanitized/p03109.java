import java.util.Scanner;

public class p03109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("/");
        
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int C = Integer.parseInt(parts[2]);
        
        if (A <= 2018) {
            System.out.println("Heisei");
        } else if (A == 2019 && B <= 4 && C <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
        
        scanner.close();
    }
}