import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03711 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        Set<Integer> a = new HashSet<>();
        // Adding elements of 'a' month group
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(8);
        a.add(10);
        a.add(12);
        
        Set<Integer> b = new HashSet<>();
        // Adding elements of 'b' month group
        b.add(4);
        b.add(6);
        b.add(9);
        b.add(11);
        
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if ((a.contains(x) && a.contains(y)) || (b.contains(x) && b.contains(y))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}