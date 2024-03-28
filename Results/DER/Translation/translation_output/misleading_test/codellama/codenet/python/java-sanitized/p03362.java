import java.util.Scanner;

public class p03362 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] primeNums = new int[2000];
        primeNums[0] = 2;
        for (int i = 3; i <= 2000; i++) {
            for (int j = 0; j < primeNums.length; j++) {
                if (primeNums[j] >= Math.sqrt(i) + 1) {
                    primeNums[j + 1] = i;
                    break;
                }
                if (i % primeNums[j] == 0) {
                    break;
                }
            }
        }

        int[] ans = new int[n];
        int count = 0;
        for (int i = 0; i < primeNums.length; i++) {
            if (primeNums[i] % 10 == 1) {
                ans[count++] = primeNums[i];
            }
            if (count == n) {
                break;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}