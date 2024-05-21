import java.util.Scanner;

public class p03803 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] j = {2,3,4,5,6,7,8,9,10,11,12,13,1};
        if (j[a-1] > j[b-1]) {
            System.out.println("Alice");
        } else if (j[a-1] < j[b-1]) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}