import java.util.Scanner;

public class p03456 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        
        String[] parts = line.split(" ");
        long n = Long.parseLong(parts[0] + parts[1]);
        long sqrtn = (long) Math.sqrt(n);
        boolean isPerfectSquare = false;
        
        for (long i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
        }
        
        System.out.println(isPerfectSquare ? "Yes" : "No");
    }
}