import java.util.Scanner;

public class p02778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            System.out.print("x");
        }
    }
}