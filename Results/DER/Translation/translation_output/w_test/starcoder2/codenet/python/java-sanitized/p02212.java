import java.util.Scanner;

public class p02212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[4];
        for (int i = 0; i < 4; i++) {
            l[i] = sc.nextInt();
        }
        sc.close();
        int[] sorted = new int[4];
        for (int i = 0; i < 4; i++) {
            int min = l[i];
            int minIndex = i;
            for (int j = i; j < 4; j++) {
                if (l[j] < min) {
                    min = l[j];
                    minIndex = j;
                }
            }
            sorted[i] = min;
            l[minIndex] = Integer.MAX_VALUE;
        }
        System.out.println(Math.abs((sorted[0] + sorted[3]) - (sorted[1] + sorted[2])));
    }
}