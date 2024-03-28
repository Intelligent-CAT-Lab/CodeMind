import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03803 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        Map<Integer, Integer> j = new HashMap<>();
        
        // Create a map to store the card values with their order
        for (int i = 2; i <= 13; i++) {
            j.put(i, i - 2);
        }
        // Add the Ace with the highest order
        j.put(1, 12);

        // Check who wins
        if (j.get(a) > j.get(b)) {
            System.out.println("Alice");
        } else if (j.get(a) < j.get(b)) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}