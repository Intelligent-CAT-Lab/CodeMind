import java.util.Scanner;

public class p01810 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        int a = 0;

        for (int i = 0; i < n - 1; i++) {
            a += a / (k - 1) + 1;
        }

        System.out.println(a);
        
        scanner.close();
    }
}