import java.util.Scanner;

public class p03352 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        int ans = 1;
        
        for (int b = 1; b < x; b++) {
            for (int p = 2; ; p++) {
                int temp = (int)Math.pow(b, p);
                if (temp <= x) {
                    ans = Math.max(ans, temp);
                } else {
                    break;
                }
            }
        }
        
        System.out.println(ans); // Output the answer
        scanner.close();
    }
}