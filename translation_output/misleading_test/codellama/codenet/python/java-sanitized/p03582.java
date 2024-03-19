import java.util.Scanner;

public class p03582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[][] L = new int[a + b + c][];
        for (int i = 0; i < a; i++) {
            L[i] = new int[] {0};
        }
        for (int i = a; i < a + b; i++) {
            L[i] = new int[] {1};
        }
        for (int i = a + b; i < a + b + c; i++) {
            L[i] = new int[] {2};
        }

        while (L.length > 1) {
            L[0] = add(L[0], L.pop());
            L.sort((a, b) -> a[0] - b[0]);
        }

        String result = "";
        for (int i = 0; i < L[0].length; i++) {
            if (L[0][i] == 0) {
                result += "a";
            } else if (L[0][i] == 1) {
                result += "b";
            } else {
                result += "c";
            }
        }

        System.out.println(result);
    }

    private static int[] add(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[i + a.length] = b[i];
        }
        return result;
    }
}