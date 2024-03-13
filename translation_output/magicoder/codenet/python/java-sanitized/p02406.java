import java.util.Scanner;
import java.util.ArrayList;

public class p02406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                A.add(i);
            }
        }
        for (int i = 0; i < A.size() - 1; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.println(A.get(A.size() - 1));
    }
}