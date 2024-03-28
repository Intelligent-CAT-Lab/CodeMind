import java.util.Scanner;

public class p02792 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] num = new int[10][10];

        for (int i = 1; i <= N; i++) {
            if (i % 10 > 0) {
                String numberStr = Integer.toString(i);
                num[Character.getNumericValue(numberStr.charAt(0))][i % 10] += 1;
            }
        }

        // Uncomment to print num
        // for(int[] row : num) {
        //     System.out.println(Arrays.toString(row));
        // }

        int c = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                c += num[i][j] * num[j][i];
            }
        }
        System.out.println(c);

        scanner.close();
    }
}