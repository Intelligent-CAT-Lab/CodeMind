import java.util.Scanner;

public class p03582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int[] L = new int[a + b + c];
        for (int i = 0; i < a; i++) {
            L[i] = 0;
        }
        for (int i = a; i < a + b; i++) {
            L[i] = 1;
        }
        for (int i = a + b; i < a + b + c; i++) {
            L[i] = 2;
        }

        while (L.length > 1) {
            L[0] += L.pop();
            L.sort();
        }

        String result = "";
        for (int i = 0; i < L[0]; i++) {
            if (i == 0) {
                result += "a";
            } else if (i == 1) {
                result += "b";
            } else {
                result += "c";
            }
        }
        System.out.println(result);
    }
}