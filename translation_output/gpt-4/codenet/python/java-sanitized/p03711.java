import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class p03711 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        
        // Create sets for months with the same number of days
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(3);
        setA.add(5);
        setA.add(7);
        setA.add(8);
        setA.add(10);
        setA.add(12);
        
        Set<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(6);
        setB.add(9);
        setB.add(11);
        
        // Check for the condition where month is February
        if (x == 2 || y == 2) {
            System.out.println("No");
        }
        // Check if both x and y are in the same set
        else if ((setA.contains(x) && setA.contains(y)) || (setB.contains(x) && setB.contains(y))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}