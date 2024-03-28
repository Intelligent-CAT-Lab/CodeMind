import java.util.*;

public class p03803 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] j = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1};
        if (Arrays.binarySearch(j, a) > Arrays.binarySearch(j, b)) {
            System.out.println("Alice");
        } else if (Arrays.binarySearch(j, a) < Arrays.binarySearch(j, b)) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}