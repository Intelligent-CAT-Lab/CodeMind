import java.util.Scanner;

public class p03288 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Test input: 1199

        if(n < 1200){
            System.out.println("ABC"); // Expected output for this test case: ABC
        } else if(n < 2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
        
        scanner.close();
    }
}